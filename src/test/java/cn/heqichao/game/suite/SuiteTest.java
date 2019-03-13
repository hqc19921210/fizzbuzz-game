package cn.heqichao.game.suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by heqichao on 2019-3-13.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        cn.heqichao.game.rule.BuzzRuleTest.class,
        cn.heqichao.game.rule.BuzzRuleTest.class,
        cn.heqichao.game.rule.FizzRuleTest.class,
        cn.heqichao.game.strategy.GameStrategyTest.class,
})
public class SuiteTest {
}
