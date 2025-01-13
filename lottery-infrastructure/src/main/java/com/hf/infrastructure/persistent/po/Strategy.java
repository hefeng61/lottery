package com.hf.infrastructure.persistent.po;


import lombok.Data;

import java.util.Date;

/**
 * @author sodap
 * @version 1.0
 * @description: 抽奖策略
 * @since 2025/1/13 20:08
 */
@Data
public class Strategy {

    private Long id;

    private Long strategyId;

    private String strategyDesc;

    private Date createTime;

    private Date updateTime;
}