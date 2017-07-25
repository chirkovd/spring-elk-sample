package com.dipegroup.elk.controllers;

import com.dipegroup.elk.services.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: spring-elk-sample
 * Description:
 * Date: 7/25/2017
 *
 * @author Dmitriy_Chirkov
 * @since 1.8
 */
@RestController
public class LoggingController {

    @Autowired
    private LoggingService loggingService;

    @RequestMapping(value = "/log", method = RequestMethod.POST)
    public void logUserMessage(@RequestBody String message) {
        loggingService.logMessage(message);
    }

}
