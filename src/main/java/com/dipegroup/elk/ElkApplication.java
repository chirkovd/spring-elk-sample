package com.dipegroup.elk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Project: spring-elk-sample
 * Description:
 * Date: 7/25/2017
 *
 * @author Dmitriy_Chirkov
 * @since 1.8
 */
@EnableScheduling
@SpringBootApplication
public class ElkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElkApplication.class, args);
    }
}
