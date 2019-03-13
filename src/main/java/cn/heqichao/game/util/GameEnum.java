package cn.heqichao.game.util;

/**
 * GameEnum
 * @author heqichao
 * @date 2019-3-13
 */
public enum GameEnum {
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZ_BUZZ("FizzBuzz"),
    ;

    private String code;
    GameEnum(String code){
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
