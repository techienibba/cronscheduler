package com.scheduler.scheduler;

import java.lang.reflect.Method;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


//Used for sending requests to API at fixed intervals or as scheduled
//Business logic needs to be scripted in every individual scheduler module
@Service
public class schedulerclass {
	
	
	
	
	@Scheduled(fixedRate=5000)
	public void ratescheduler()
	{
		
		System.out.println("this is rateScheduler");
	}
	
	
	@Scheduled(fixedDelay=5000)
	public void delayscheduler()
	{
		
		System.out.println("this is fixedDelay");
	}
	
	
	@Scheduled(cron="0 52 16 * * ?")
	public void cronscheduler()
	{
		
		System.out.println("this is cron scheduler");
	}

}
