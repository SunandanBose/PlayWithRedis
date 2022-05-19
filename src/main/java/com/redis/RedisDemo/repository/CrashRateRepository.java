package com.redis.RedisDemo.repository;

import com.redis.RedisDemo.entity.CrashRate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrashRateRepository extends CrudRepository<CrashRate, Integer> {

}
