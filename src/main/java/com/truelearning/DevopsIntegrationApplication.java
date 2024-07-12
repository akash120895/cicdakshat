package com.truelearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	@GetMapping
	public String message(){
		return "Hi everyone, welcome to my channel! I'm devyani shende, a fashion designer  and I'm excited to share my passion with you. On this channel, I'll be sharing fashion related cutting and stitching videos, including some DIY & small crafts videos. ";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
