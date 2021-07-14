package com.example.springbootcachejdk.service;

import com.example.springbootcachejdk.entity.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Iabur on July 14, 2021.
 */
@Service
@Slf4j
public class CacheService {
    @Autowired
    private CacheManager cacheManager;

    private Map<String, City> cityMap = new HashMap<>();

    CacheService() {
        cityMap.put("Dhaka", City.builder().name("Dhaka").zipCode("1234").build());
        cityMap.put("Dinajpur", City.builder().name("Dinajpur").zipCode("4321").build());
    }

    @Cacheable(value = "name_zipCode")
    public City getCityByName(String name) {
        log.info("Inside getCityByName method of CacheService class");
        return cityMap.get(name);
    }

    public Cache GetCityFromCache(String name) {
        return cacheManager.getCache(name);
    }

    @CachePut(value = "name_zipCode", key = "#city.name")
    public City insertCity(City city) {
        cityMap.put(city.getName(), city);
        return city;
    }

    @CacheEvict(value = "name_zipCode", allEntries = true)
    public String deleteCache() {
        return "All caches are deleted";
    }
}
