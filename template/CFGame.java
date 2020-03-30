package template;

/**
 * CF concrete class
 *
 * @author YuanWei
 * @date 2020/3/30 19:45
 */
public class CFGame extends Game {
    @Override
    public void initialize() {
        System.out.println("CF initialize");
    }

    @Override
    public void startGame() {
        System.out.println("CF startGame");
    }

    @Override
    public void endGame() {
        System.out.println("CF endGame");
    }
}
