package com.hf.infrastructure.persistent.po;


import lombok.Data;

import java.util.Date;

/**
 * @author sodap
 * @version 1.0
 * @description:
 * @since 2025/1/13 20:25
 */
@Data
public class Award {

    private Long id;

    private Long awardId;

    private String awardKey;

    private String awardConfig;

    private String awardDesc;

    private Date createTime;

    private Date updateTime;
}