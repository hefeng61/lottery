package com.hf.test.infrastructure;


import com.hf.infrastructure.persistent.dao.IAwardDao;
import com.hf.infrastructure.persistent.dao.IStrategyDao;
import com.hf.infrastructure.persistent.po.Award;
import com.hf.infrastructure.persistent.po.Strategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sodap
 * @version 1.0
 * @description: TODO
 * @since 2025/1/13 20:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDao awardDao;

    @Resource
    private IStrategyDao strategyDao;

    @Test
    public void testQueryAwardList() {
        List<Award> awards = awardDao.queryAwardList();
        awards.forEach(System.out::println);
        System.out.println(awards);
    }

    @Test
    public void testQueryStrategyList() {
        List<Strategy> strategies = strategyDao.queryStrategyList();
        System.out.println(strategies);
    }

}