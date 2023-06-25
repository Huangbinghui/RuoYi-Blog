package com.ruoyi.common.core.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RedisData<T> {
    private T data;
    private LocalDateTime expireTime;
}
