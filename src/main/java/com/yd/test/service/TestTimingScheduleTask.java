package com.yd.test.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yd.test.bean.ScheduleCronBean;
import com.yd.test.dao.ScheduleConfigMapper;

/**
 * 采集指标的定时任务，程序启动时执行.
 */
@Configuration
@EnableScheduling
public class TestTimingScheduleTask implements SchedulingConfigurer {
	@Autowired
	private ScheduleConfigMapper scheduleConfigMapper;

	@Autowired
	private ThreadPoolTaskScheduler threadPoolTaskScheduler;

	@Bean
	public ThreadPoolTaskScheduler trPoolTaskScheduler() {
		return new ThreadPoolTaskScheduler();
	}

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		QueryWrapper<ScheduleCronBean> queryWrapper = new QueryWrapper<ScheduleCronBean>();
		List<ScheduleCronBean> tasks = scheduleConfigMapper.selectList(queryWrapper);
		tasks.forEach(task -> {
			// 任务触发器
			Trigger trigger = triggerContext -> {
				// 获取定时触发器，这里可以每次从数据库获取最新记录，更新触发器，实现定时间隔的动态调整
				CronTrigger cronTrigger = new CronTrigger(task.getCrontab());
				return cronTrigger.nextExecutionTime(triggerContext);
			};
			// 注册任务
			taskRegistrar.addTriggerTask(new TestRunnable(task.getId()), trigger);
		});

	}

	@PostConstruct
	public void add() {
		threadPoolTaskScheduler.schedule(new TestRunnable("003"), new CronTrigger("0 0/1 * * * ?"));
	}
}
