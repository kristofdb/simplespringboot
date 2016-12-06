package com.db.test.inmemory;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kristof on 21/11/2016.
 */
public final class InMemoryDataBase {

    private InMemoryDataBase(){
        throw new AssertionError();
    }

    private static final Map<String,String> keyValueMap = new HashMap<>();

    public static String getValue(String key){
        return keyValueMap.get(key);
    }

    public static void addValue(final String key,final String value){
        Assert.state(!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value));

        keyValueMap.put(key,value);
    }
}
