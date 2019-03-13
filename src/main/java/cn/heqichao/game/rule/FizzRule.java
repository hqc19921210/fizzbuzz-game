package cn.heqichao.game.rule;

import cn.heqichao.game.util.GameEnum;

/**
 * FizzRule
 * @author heqichao
 * @date 2019-3-13
 */
public class FizzRule extends GameRule {


    public FizzRule(int priority) {
        super(priority);
    }

    @Override
    public boolean match(int number) {
        return number%3 == 0 ;
    }

    @Override
    public String print() {
        return GameEnum.FIZZ.getCode();
    }
}
