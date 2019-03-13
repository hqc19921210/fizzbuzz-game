package cn.heqichao.game.strategy;

import cn.heqichao.game.rule.GameRule;
import java.util.List;

/**
 * the game strategy
 * Created by heqichao on 2019-3-13.
 */
public abstract class GameStrategy {

    private List<GameRule> ruleList;

    private GameStrategy(){};

    public GameStrategy(List<GameRule> ruleList){
        this.ruleList=ruleList;
    };
    /**
     *
     * @param number
     * @return
     */
    public abstract String execute(int number) throws Exception;

    public List<GameRule> getRuleList() {
        return ruleList;
    }
}
