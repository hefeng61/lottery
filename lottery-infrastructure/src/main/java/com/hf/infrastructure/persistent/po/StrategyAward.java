package com.hf.infrastructure.persistent.po;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author sodap
 * @version 1.0
 * @description: 策略奖品
 * @since 2025/1/13 20:10
 */
@Data
public class StrategyAward {

    private Long id;

    private Long strategyId;

    private String awardId;

    private String awardTitle;

    private String awardSubtitle;

    private Integer awardCount;

    private Integer awardSurplusCount;

    private BigDecimal awardRate;

    private Integer ruleModels;

    private Integer sort;

    private Date createTime;

    private Date updateTime;
}