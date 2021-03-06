package com.didichuxing.tools.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface TestAnnotation2 {
    int intValue() default 300;

    String strValue() default "TestAnnotation2";
}
