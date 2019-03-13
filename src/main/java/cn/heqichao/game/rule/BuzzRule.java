package cn.heqichao.game.rule;

import cn.heqichao.game.util.GameEnum;

/**
 * BuzzRule
 * @author heqichao
 * @date 2019-3-13
 */
public class BuzzRule extends GameRule {

    public BuzzRule(int priority) {
        super(priority);
    }

    @Override
    public boolean match(int number) {
        return number % 5 == 0;
    }

    @Override
    public String print() {
        return GameEnum.BUZZ.getCode();
    }
}
