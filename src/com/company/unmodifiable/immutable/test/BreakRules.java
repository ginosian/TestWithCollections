package com.company.unmodifiable.immutable.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by marta.ginosyan on 11/17/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface BreakRules {

    boolean immutableCollection() default false;
    boolean immutableMap() default false;
    boolean unmodifableCollection() default false;
    boolean unmodifableMap() default false;
}
