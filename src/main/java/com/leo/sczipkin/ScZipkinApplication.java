package com.leo.sczipkin;

import zipkin.server.EnableZipkinServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZipkinServer
public class ScZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScZipkinApplication.class, args);
	}
}
