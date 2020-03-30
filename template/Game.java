package template;

/**
 * 模板模式顶级父类
 *
 * @author YuanWei
 * @date 2020/3/30 19:42
 */
public abstract class Game {

    /**
     * init
     */
    abstract void initialize();

    /**
     * start the game
     */
    abstract void startGame();

    /**
     * end the game
     */
    abstract void endGame();

    protected void palyTheGame() {
        initialize();

        startGame();

        endGame();
    }
}
