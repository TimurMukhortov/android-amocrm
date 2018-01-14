package com.example.timurmuhortov.amocrm.util.gson;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 3:48
 * @LinkedIn: linkedin.com/in/timurmukhortov
 *
 * Indicate field with this annotation to exclude it from the JSON object
 **/


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Exclude {
}
