package com.hf.infrastructure.persistent.dao;

import com.hf.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sodap
 * @version 1.0
 * @description: TODO
 * @since 2025/1/13 20:36
 */
@Mapper
public interface IStrategyRuleDao {

    List<StrategyRule> queryStrategyRuleList();
}
