package template;

/**
 * DNF concrete class
 *
 * @author YuanWei
 * @date 2020/3/30 19:45
 */
public class DNFGame extends Game {
    @Override
    public void initialize() {
        System.out.println("DNF initialize");
    }

    @Override
    public void startGame() {
        System.out.println("DNF startGame");
    }

    @Override
    public void endGame() {
        System.out.println("DNF endGame");
    }
}
