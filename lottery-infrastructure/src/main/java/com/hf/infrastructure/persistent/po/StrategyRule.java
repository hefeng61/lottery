package com.hf.infrastructure.persistent.po;


import lombok.Data;

import java.util.Date;

/**
 * @author sodap
 * @version 1.0
 * @description: 策略规则
 * @since 2025/1/13 20:16
 */
@Data
public class StrategyRule {

    private Long id;

    private Long strategyId;

    private Long ruleId;

    private Integer ruleType;

    private String ruleModel;

    private String ruleValue;

    private String ruleDesc;

    private Date createTime;

    private Date updateTime;
}