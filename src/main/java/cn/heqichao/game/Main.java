package cn.heqichao.game;

import cn.heqichao.game.rule.*;
import cn.heqichao.game.strategy.GameStrategy;
import cn.heqichao.game.strategy.FizzBuzzGameStrategy;
import java.util.Arrays;

/**
 *
 * @author heqichao
 * @date 2019-3-13
 */
public class Main {

    public static void main(String[] args) {
        int number =100;
        GameStrategy gameStrategy = new FizzBuzzGameStrategy(Arrays.asList(new FizzRule(1),new BuzzRule(1),new FizzBuzzRule(2)));
        new MathGame(gameStrategy).play(number);
    }

}

class MathGame {

    private GameStrategy gameStrategy;

    public MathGame(GameStrategy gameStrategy){
        this.gameStrategy=gameStrategy;
    }

    private MathGame(){}

    public void  play(int length){
         try {
             for(int i=1;i<=length;i++){
                System.out.println(this.gameStrategy.execute(i));
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
}
