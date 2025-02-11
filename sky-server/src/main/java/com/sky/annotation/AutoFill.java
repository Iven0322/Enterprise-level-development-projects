package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解，用于表示某个方法需要进行功能字段自动填充处理
@Target(ElementType.METHOD)//表示当前注解只能用在方法上
@Retention(RetentionPolicy.RUNTIME)//指定当前注解只能在运行时使用
public @interface AutoFill {
    //指定数据库操作类型：update和insert
    OperationType value();
}
