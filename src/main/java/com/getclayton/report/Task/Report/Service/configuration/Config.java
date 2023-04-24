package com.getclayton.report.Task.Report.Service.configuration;

/*
 * @author okka
 * @created 24/04/2023 - 15:02
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@EnableScheduling
public class Config {
}
