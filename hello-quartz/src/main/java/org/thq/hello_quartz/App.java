package org.thq.hello_quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SchedulerException
    {
        //simpleJob();
    	cronJob();
    }
    public static void simpleJob() throws SchedulerException {
    	JobDetail job = JobBuilder.newJob(HelloJob.class)
    			.withIdentity("dummyJobName", "group1").build();
    	
    	Trigger trigger = TriggerBuilder
    			.newTrigger()
    			.withIdentity("dummyTriggerName", "group1")
    			.withSchedule(
    				SimpleScheduleBuilder.simpleSchedule()
    					.withIntervalInSeconds(5).repeatForever())
    			.build();
    	
    	Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.start();
		scheduler.scheduleJob(job, trigger);
    }
    public static void cronJob() throws SchedulerException {
    	JobDetail job = JobBuilder.newJob(HelloJob.class)
    			.withIdentity("dummyJobName", "group1").build();
    	
    	Trigger trigger = TriggerBuilder
    			.newTrigger()
    			.withIdentity("dummyTriggerName", "group1")
    			.withSchedule(
    				CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
    			.build();
    	
    	//schedule it
    	Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    	scheduler.start();
    	scheduler.scheduleJob(job, trigger);
    }
}
