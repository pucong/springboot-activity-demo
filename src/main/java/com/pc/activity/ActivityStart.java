package com.pc.activity;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;


public class ActivityStart {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
    }
}
