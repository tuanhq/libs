package org.thq.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class SampleJob implements Job {	
	
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.err.println("Hello spring quarzt");
	}
	 
	
	 

}
