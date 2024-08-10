package com.engein.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.engein.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}
