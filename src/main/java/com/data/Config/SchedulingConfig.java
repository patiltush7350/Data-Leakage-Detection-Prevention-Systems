package com.data.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.data.service.DataLeakageDetectionService;

@Configuration
@EnableScheduling
public class SchedulingConfig {
	@Autowired
    private DataLeakageDetectionService detectionService;

    @Scheduled(fixedRate = 60000) // Run every 60 seconds
    public void scheduleLeakageDetection() {
        detectionService.detectLeakage();
    }
}
