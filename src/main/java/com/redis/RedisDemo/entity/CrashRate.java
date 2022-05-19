package com.redis.RedisDemo.entity;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash
public class CrashRate implements Serializable {

    public Integer id;

    public Long time;

    public Integer count;

}
