package cn.heqichao.game.rule;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by heqichao on 2019-3-13.
 */
public class FizzRuleTest {

    private static GameRule gameRule ;

    @BeforeClass
    public static void beforeClass(){
        gameRule=new FizzRule(1);
    }

    @Test
    public void TestFizzRuleMatch(){
        int number =36;
        Assert.assertTrue(gameRule.match(number));
    }



}
