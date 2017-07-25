package com.dipegroup.elk.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Copyright (c) 2017, DIPE Systems. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * <p>
 * Project: spring-elk-sample
 * Description:
 * Date: 7/25/2017
 *
 * @author Dmitriy_Chirkov
 * @since 1.8
 */
@Service
public class LoggingService {

    public static final Logger logger = LoggerFactory.getLogger(LoggingService.class);

    public void logMessage(String name) {
        logger.debug("Log message: {}", name);
    }

}
