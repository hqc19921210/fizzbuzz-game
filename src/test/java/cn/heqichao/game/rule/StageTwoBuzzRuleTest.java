package cn.heqichao.game.rule;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by heqichao on 2019-3-13.
 */
public class StageTwoBuzzRuleTest {

    private static GameRule gameRule ;

    @BeforeClass
    public static void beforeClass(){
        gameRule=new BuzzRule(1);
    }

    @Test
    public void TestStageTwoBuzzRuleMatch(){
        int number =55;
        Assert.assertTrue(gameRule.match(number));
    }



}
