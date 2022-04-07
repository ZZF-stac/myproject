package com.zzf.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }

    //配置后台管理
//    @Bean
//    public ServletRegistrationBean statRegistVew(){
//
//        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
//
//
//        return bean;
//    }

}
