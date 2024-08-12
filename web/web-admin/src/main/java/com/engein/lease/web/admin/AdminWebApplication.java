package com.engein.lease.web.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan("com.engein.lease.web.*.mapper")
@ComponentScans({
        @ComponentScan("com.engein.lease.common.minio"),
        @ComponentScan("com.engein.lease.web.admin.custom.config"),
        @ComponentScan("com.engein.lease.web.admin.custom.converter"),
        @ComponentScan("com.engein.lease.web.admin.custom.interceptor")
})
public class AdminWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminWebApplication.class, args);
    }
}
