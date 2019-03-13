package cn.heqichao.game.rule;

import cn.heqichao.game.strategy.GameStrategy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by heqichao on 2019-3-13.
 */
public class StageTwoFizzRuleTest {

    private static GameRule gameRule ;
    private static GameStrategy gameStrategy;

    @BeforeClass
    public static void beforeClass(){
        gameRule=new FizzRule(1);
    }

    @Test
    public void TestStageTwoFizzRuleMatch(){
        int number =37;
        Assert.assertTrue(gameRule.match(number));
    }

}
