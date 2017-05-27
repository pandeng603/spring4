package com.pand.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dateFormat = 
			new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("每隔5秒执行一次:"+dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 29 15 ? * *")
	public void fixTimeExecution() {
		System.out.println("在指定时间执行"+dateFormat.format(new Date()));
	}
}
