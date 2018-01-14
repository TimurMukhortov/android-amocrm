package com.example.timurmuhortov.amocrm.util.gson

import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 3:46
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class AnnotationExclusionStrategy : ExclusionStrategy {

    override fun shouldSkipClass(clazz: Class<*>?): Boolean {
        return false
    }

    override fun shouldSkipField(f: FieldAttributes?): Boolean {
        return f?.getAnnotation(Exclude::class.java) != null
    }
}