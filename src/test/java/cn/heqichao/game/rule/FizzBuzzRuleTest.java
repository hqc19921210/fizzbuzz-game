package cn.heqichao.game.rule;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by heqichao on 2019-3-13.
 */
public class FizzBuzzRuleTest {

    private static GameRule gameRule ;

    @BeforeClass
    public static void beforeClass(){
        gameRule=new FizzBuzzRule(1);
    }

    @Test
    public void TestFizzBuzzRuleMatch(){
        int number =30;
        Assert.assertTrue(gameRule.match(number));
    }



}
