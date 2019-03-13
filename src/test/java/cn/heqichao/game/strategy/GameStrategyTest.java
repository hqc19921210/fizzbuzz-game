package cn.heqichao.game.strategy;

import cn.heqichao.game.rule.*;
import cn.heqichao.game.util.GameEnum;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by heqichao on 2019-3-13.
 */
public class GameStrategyTest {

    @Test
    public void TestBuzzRulePrint() throws Exception {
        int number =45;
        GameStrategy gameStrategy= new FizzBuzzGameStrategy(Arrays.asList(new BuzzRule(1)));
        Assert.assertTrue(GameEnum.BUZZ.getCode().equals(gameStrategy.execute(number)));
    }

    @Test
    public void TestFizzBuzzRulePrint() throws Exception {
        int number =60;
        GameStrategy gameStrategy= new FizzBuzzGameStrategy(Arrays.asList(new FizzBuzzRule(1)));
        Assert.assertTrue(GameEnum.FIZZ_BUZZ.getCode().equals(gameStrategy.execute(number)));
    }

    @Test
    public void TestFizzRulePrint() throws Exception {
        int number =45;
        GameStrategy gameStrategy= new FizzBuzzGameStrategy(Arrays.asList(new FizzRule(1)));
        Assert.assertTrue(GameEnum.FIZZ.getCode().equals(gameStrategy.execute(number)));
    }

}
