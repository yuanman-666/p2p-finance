package com.p2p.finance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//ccy
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@MapperScan("com.p2p.finance.dao")
public class FinanceAllApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceAllApplication.class, args);
    }

}
