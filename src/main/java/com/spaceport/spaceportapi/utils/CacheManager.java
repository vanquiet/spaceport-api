package com.spaceport.spaceportapi.utils;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    private static CacheManager instance;
    private final Map<String, Object> cache = new HashMap<>();

    private CacheManager() {
    }

    public static CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        }
        return instance;
    }

    public Object get(String key) {
        return cache.get(key);
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public void remove(String key) {
        cache.remove(key);
    }

    public void clear() {
        cache.clear();
    }
}
