package cn.heqichao.game.rule;

import cn.heqichao.game.util.GameEnum;

/**
 * FizzBuzzRule
 * @author heqichao
 * @date 2019-3-13
 */
public class FizzBuzzRule extends GameRule {


    public FizzBuzzRule(int priority) {
        super(priority);
    }

    @Override
    public boolean match(int number) {
        return (number % 3 == 0 && number % 5 ==0 ) || ( String.valueOf(number).contains("5") && String.valueOf(number).contains("3"));
    }

    @Override
    public String print() {
        return GameEnum.FIZZ_BUZZ.getCode();
    }
}
