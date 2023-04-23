package com.example.demo.annotation;

import com.example.demo.enums.DataSourceType;

import java.lang.annotation.*;

/**
 * 用于切换数据源
 * @author devcxl
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    DataSourceType value() default DataSourceType.PRIMARY;
}
