package cn.heqichao.game.rule;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by heqichao on 2019-3-13.
 */
public class StageTwoFizzBuzzRuleTest {

    private static GameRule gameRule ;

    @BeforeClass
    public static void beforeClass(){
        gameRule=new FizzBuzzRule(1);
    }

    @Test
    public void TestStageTwoFizzBuzzRuleMatch(){
        int number =53;
        Assert.assertTrue(gameRule.match(number));
    }



}
