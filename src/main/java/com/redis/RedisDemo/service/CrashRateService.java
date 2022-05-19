package com.redis.RedisDemo.service;

import com.redis.RedisDemo.entity.CrashRate;
import com.redis.RedisDemo.repository.CrashRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrashRateService {

    @Autowired
    private CrashRateRepository crashRateRepository;
    public void save(CrashRate crashRate) {
        crashRateRepository.save(crashRate);
    }
}
