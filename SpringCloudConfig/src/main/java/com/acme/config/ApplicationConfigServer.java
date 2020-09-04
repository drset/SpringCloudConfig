package com.acme.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//https://medium.com/@migueldoctor/spring-cloud-series-spring-cloud-config-server-con-github-paso-a-paso-135d2b4aaf4c
@SpringBootApplication
@EnableConfigServer
public class ApplicationConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigServer.class, args);
    }
}
