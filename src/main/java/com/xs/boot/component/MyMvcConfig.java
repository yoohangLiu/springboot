package com.xs.boot.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置文件，当前配置页面路由；添加拦截器。
 */

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    //直接配置页面调整url映射
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/main").setViewName("index");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login", "/login-check", "/logout","/static/**");
    }
}
