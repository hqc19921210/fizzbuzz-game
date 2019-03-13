package cn.heqichao.game.rule;

/**
 * GameRule
 * @author heqichao
 * @date 2019-3-13
 */
public abstract class GameRule {
    private int priority = 0;
    private GameRule(){};

    public GameRule(int priority){
        this.priority = priority;
    }

    public abstract boolean match(int number);
    public abstract String print();

    public int getPriority() {
        return priority;
    }
}
