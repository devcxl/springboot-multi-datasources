package com.example.demo.config;

import com.example.demo.annotation.DataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 用于处理数据源切换逻辑
 * @author devcxl
 */
@Aspect
@Component
public class DataSourceAspect {

    @Around("@annotation(ds)")
    public Object around(ProceedingJoinPoint point, DataSource ds) throws Throwable {
        try {
            DynamicDataSourceContextHolder.setContext(ds.value());
            return point.proceed();
        } finally {
            DynamicDataSourceContextHolder.clearContext();
        }
    }
}
