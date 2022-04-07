package com.zzf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println(registry.hasMappingForPattern("/**/**"));
        if (!registry.hasMappingForPattern("/**/**")){
//            registry.addResourceHandler("/images/**").addResourceLocations("classpath:/images/**");
            registry.addResourceHandler("/wocao/**").addResourceLocations("classpath:/wocao/");
            registry.addResourceHandler("/images/**").addResourceLocations("classpath:/images/");
            registry.addResourceHandler("/user/images/**").addResourceLocations("classpath:/images/");
//            registry.addResourceHandler("/main.html").addResourceLocations("success");
            registry.addResourceHandler("/login").addResourceLocations("login");
//            registry.addResourceHandler("/regist").addResourceLocations("success");

        }
        super.addResourceHandlers(registry);
    }
}
