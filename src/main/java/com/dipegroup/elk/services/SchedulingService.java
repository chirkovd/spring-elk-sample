package com.dipegroup.elk.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project: spring-elk-sample
 * Description:
 * Date: 7/25/2017
 *
 * @author Dmitriy_Chirkov
 * @since 1.8
 */
@Service
public class SchedulingService {

    private static final Logger logger = LoggerFactory.getLogger(SchedulingService.class);
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        logger.info("Current time is {}", SIMPLE_DATE_FORMAT.format(new Date()));
    }
}
