package com.p2p.finance.getway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2020/2/3 22:00
 * @modified By:
 */
@Configuration
public class GmallCorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){

        //cors跨域配置对象
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        corsConfiguration.addAllowedOrigin("http://localhost:1000");
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedHeader("*");

        //配置域对象
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration );
        //corsair过滤器对象
        return new CorsWebFilter(urlBasedCorsConfigurationSource);

双击评论666
    }
}
