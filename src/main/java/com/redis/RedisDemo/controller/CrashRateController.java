package com.redis.RedisDemo.controller;

import com.redis.RedisDemo.entity.CrashRate;
import com.redis.RedisDemo.service.CrashRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrashRateController {

    @Autowired
    private CrashRateService crashRateService;

    @PostMapping(value = "/save")
    public void save(@RequestBody CrashRate crashRate){
        crashRateService.save(crashRate);
    }
}
