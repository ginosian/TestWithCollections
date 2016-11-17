package com.company.unmodifiable.immutable.test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * Created by marta.ginosyan on 11/17/2016.
 */
public class OperationsProvider {

    // With Guava
    public static Collection makeCollectionImmutableWithGuava(Collection collection){
        return ImmutableList.copyOf(collection);
    }

    public static Map makeMapImmutableWithGuava(Map map){
        return ImmutableMultimap.copyOf();
    }

    public static Map makeMapUnmodifableWithGuava(Map map){
        return null;
    }

    //With Commons Collection
    public static Collection makeCollectionImmutableWithCommons(Collection collection){
        return Collections.unmodifiableCollection(collection);
    }

    public static Collection makeCollectionUnmodifableWithCommons(Collection collection){
        return Collections.unmodifiableCollection(collection);
    }

    public static Map makeMapImmutableWithCommons(Map map){
        return Collections.unmodifiableMap(map);
    }

    public static Map makeMapUnmodifableWithCommons(Map map){
        return Collections.unmodifiableMap(map);
    }

    public static Object getCollection(Collection collection, String brakingMethodType) {
        try {
            Object value;
            Field fields[] = collection.getClass().getDeclaredFields();
            for (int i = 0; i < fields.length; ++i) {
                BreakRules annotation = fields[i].getAnnotation(BreakRules.class);
                if (annotation != null) {
                    Method requestField = annotation.getClass().getMethod(brakingMethodType);
                    if ((Boolean) (requestField.invoke(annotation, null))) {
                        fields[i].setAccessible(true);
                        value = fields[i].get(collection);
                        return value;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
