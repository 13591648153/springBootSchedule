package com.yd.test.service;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class CollectIndicatorServiceImpl {
//    private static final Logger logger = LoggerFactory.getLogger(CollectIndicatorServiceImpl.class);
//    @Autowired
//    private CollectIndicatorConfigMapper collectIndicatorConfigMapper;
//    @Autowired
//    private NetworkDeviceInfoMapper networkDeviceInfoMapper;
//    @Autowired
//    private AlarmUtilMapper alarmUtilMapper;
//    @Autowired
//    private NetworkDevicePortInfoMapper networkDevicePortInfoMapper;
//    @Autowired
//    private UserClient userClient;
//
//    @Autowired
//    private ThreadPoolTaskScheduler threadPoolTaskScheduler;
//
//    private ScheduledFuture<?> future;
//    private Map<String,ScheduledFuture<?>> futureMap = new HashMap<>();
//
//    @Bean
//    public ThreadPoolTaskScheduler trPoolTaskScheduler(){
//        return new ThreadPoolTaskScheduler();
//    }
//
//    public PageInfo<CollectIndicatorConfig> getList(Integer pageNum, Integer pageSize, CollectIndicatorConfig config) {
//        PageInfo<CollectIndicatorConfig> pageList = PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(new ISelect() {
//            @Override
//            public void doSelect() {
//                collectIndicatorConfigMapper.selectList(config);
//            }
//        });
//        return pageList;
//    }
//
//    @Transactional
//    public CollectIndicatorConfig add(CollectIndicatorConfig config) {
//        User user = userClient.getCurrentUser();
//        CollectIndicatorConfig indicator = collectIndicatorConfigMapper.checkMetricId(config);
//        if (indicator != null) {
//            throw new BizException("当前源的指标ID已经被其他性能项使用,请重新核对");
//        }
//        //添加alarm_metric和collect_indicator_config
//        config.setCreateBy(user.getId());
//        config.setId(UUID.random());
//        config.setCreateAt(new Date());
//        config.setDeleted(false);
//        config.setCron(parseInterval(config.getInterval()));
//        MetricType metricType = addMetricType(config);
//        config.setMetricAssociatedId(metricType.getId());
//        collectIndicatorConfigMapper.insert(config);
//        future=threadPoolTaskScheduler.schedule(new myRunable(config.getId()),new CronTrigger(config.getCron()));
//        futureMap.put(config.getId(),future);
//        return config;
//    }
//
//    public CollectIndicatorConfig edit(CollectIndicatorConfig config) {
//        User user = userClient.getCurrentUser();
//        config.setCron(parseInterval(config.getInterval()));
//        config.setUpdateAt(new Date());
//        config.setUpdateBy(user.getId());
//        collectIndicatorConfigMapper.update(config);
//        if(futureMap.get(config.getId())!=null){
//            futureMap.get(config.getId()).cancel(true);
//            logger.info("editTask"+config.getId());
//        }
//        future=threadPoolTaskScheduler.schedule(new myRunable(config.getId()),new CronTrigger(config.getCron()));
//        futureMap.put(config.getId(),future);
//        return config;
//    }
//
//    @Transactional
//    public int delete(BatchDelete<String> ids) {
//        User user = userClient.getCurrentUser();
//        //查询采集指标详细信息
//        List<String> collectIds = new ArrayList<>();
//        List<String> metricIds = new ArrayList<>();
//        ids.getTargets().stream().forEach(idStr->{
//            String[] idArray = idStr.split(",");
//            collectIds.add(idArray[0]);
//            metricIds.add(idArray[1]);
//        });
//        alarmUtilMapper.batchDelete(metricIds,new Date(),user.getId());
//        collectIds.stream().forEach(id ->{
//            if(futureMap.get(id)!=null){
//                futureMap.get(id).cancel(true);
//                logger.info("deleteTask"+id);
//            }
//        });
//        return collectIndicatorConfigMapper.batchUpdate(collectIds,user.getId(),new Date());
//    }
//
//    public CollectIndicatorConfig getDetail(String id) {
//        return collectIndicatorConfigMapper.getCollectIndicator(id);
//    }
//
//
//    public List<String> getPurposes() {
//        return collectIndicatorConfigMapper.getPurposes();
//    }
//
//    public CollectIndicatorConfig checkMetric(CollectIndicatorConfig config) {
//        return collectIndicatorConfigMapper.checkMetricId(config);
//    }
//
//    /**
//     * 解析周期.
//     *
//     * @param interval
//     * @return
//     */
//    private String parseInterval(String interval) {
//        String[] array = interval.split("_");
//        int rate = 0; //默认是分钟
//        switch (array[1]) {
//            case "min":
//                rate = 1;
//                break;
//            case "h":
//                rate = 2;
//                break;
//            default:
//                rate = 1;
//                break;
//        }
//        return createCronExpression(rate, Integer.parseInt(array[0]));
//    }
//
//    /**
//     * @param rate  频率 0秒；1分；2小时；3日；4月
//     * @param cycle 周期
//     * @return String
//     */
//    private String createCronExpression(int rate, int cycle) {
//        String cron = "";
//        switch (rate) {
//            case 0:// 每cycle秒执行一次
//                cron = "0/" + cycle + " * * * * ?";
//                break;
//            case 1:// 每cycle分钟执行一次
//                cron = "0 0/" + cycle + " * * * ?";
//                break;
//            case 2:// 每cycle小时执行一次
//                cron = "0 0 0/" + cycle + " * * ?";
//                break;
//            case 3:// 每cycle天的0点执行一次
//                cron = "0 0 0 1/" + cycle + " * ?";
//                break;
//            case 4:// 每cycle月的1号0点执行一次
//                cron = "0 0 0 1 1/" + cycle + " ? ";
//                break;
//            case 5://  每天cycle点执行一次
//                cron = "0 0 " + cycle + "  * * ?";
//                break;
//            default:// 默认每cycle秒执行一次
//                cron = "0/1 * * * * ?";
//                break;
//        }
//        return cron;
//    }
//    public class myRunable implements Runnable{
//        private String id;
//        public myRunable(String id) {
//            this.id = id;
//        }
//
//        @Override
//        public void run() {
//            logger.info("定时任务要执行的方法"+new Date()+"id:<<<"+this.id);
//        }
//
//    }
}
