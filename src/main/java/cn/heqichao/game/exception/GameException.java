package cn.heqichao.game.exception;

/**
 * game exception
 * @author heqichao
 * @date 2019-3-13
 */
public class GameException extends RuntimeException {

    public GameException(String errorMssage) {
        super(errorMssage);
    }
}
