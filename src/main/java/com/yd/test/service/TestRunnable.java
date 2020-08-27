package com.yd.test.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定时采集性能Runable
 */
public class TestRunnable implements Runnable {
    //日志.
    private static final Logger logger = LoggerFactory.getLogger(TestRunnable.class);
    private String id;
 
    public TestRunnable(String id) {
    	this.id = id;
    }
    
    @Override
    public void run() {
        logger.info("采集定时任务执行开始{},taskId:{}",new Date(),this.id);
    }
    //获取采集信息.
    

}
