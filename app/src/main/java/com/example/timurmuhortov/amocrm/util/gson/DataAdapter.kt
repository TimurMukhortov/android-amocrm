package com.example.timurmuhortov.amocrm.util.gson

import com.google.gson.*
import java.lang.reflect.Type
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 4:08
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class DateAdapter: JsonSerializer<Date>, JsonDeserializer<Date> {

    private var dateFormat: DateFormat

    init {
        dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    }

    override fun serialize(src: Date, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        TODO("Implement function: serialize")
    }

    override fun deserialize(json: JsonElement,
                             typeOfT: Type,
                             context: JsonDeserializationContext) =  dateFormat.parse(json.asString)

}