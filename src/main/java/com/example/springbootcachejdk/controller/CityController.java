package com.example.springbootcachejdk.controller;

import com.example.springbootcachejdk.entity.City;
import com.example.springbootcachejdk.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Iabur on July 14, 2021.
 */
@RestController
public class CityController {
    @Autowired
    private CacheService cacheService;


    @GetMapping("/city")
    public City getCityByName(@RequestParam("name") String name) {
        return cacheService.getCityByName(name);
    }

    @GetMapping("/cache")
    public Cache GetCityFromCache(@RequestParam("name") String name) {
        return cacheService.GetCityFromCache(name);
    }

    @PostMapping("/")
    public City insertCity(@RequestBody City city) {
        return cacheService.insertCity(city);
    }

    @DeleteMapping("/delete")
    public String deleteCache() {
        return cacheService.deleteCache();
    }
}
