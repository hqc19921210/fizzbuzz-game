package cn.heqichao.game.strategy;

import cn.heqichao.game.exception.GameException;
import cn.heqichao.game.rule.GameRule;
import cn.heqichao.game.util.CollectionUtil;
import java.util.List;

/**
 * the strategy for the game of  FizzBuzz
 * @author heqichao
 * @date 2019-3-13
 */
public class FizzBuzzGameStrategy extends GameStrategy {
    public FizzBuzzGameStrategy(List<GameRule> ruleList) {
        super(ruleList);
    }

    @Override
    public String execute(int number) throws Exception {
        List<GameRule> ruleList =getRuleList();
        if(!CollectionUtil.isEmpty(ruleList)){
            ruleList.sort((a,b) -> b.getPriority() - a.getPriority());
            for(GameRule rule :ruleList ){
                if(rule.match(number)){
                    return rule.print();
                }
            }
            return String.valueOf(number);
        }
        throw new GameException(" rule is empty ! ");
    }

}
