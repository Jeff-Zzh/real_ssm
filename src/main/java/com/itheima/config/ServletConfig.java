package com.itheima.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Web容器配置类
 */
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};//加载Spring配置类
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//SpringMVC容器可以访问Spring容器，反之不能
        return new Class[]{SpringMvcConfig.class};//加载SpringMVC配置类
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};//SpringMVC拦截所有的web请求
    }


}
