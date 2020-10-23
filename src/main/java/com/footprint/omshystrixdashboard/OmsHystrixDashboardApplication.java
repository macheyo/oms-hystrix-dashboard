package com.footprint.omshystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableHystrix
public class OmsHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmsHystrixDashboardApplication.class, args);
	}

}
