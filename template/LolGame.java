package template;

/**
 * LOL concrete class
 *
 * @author YuanWei
 * @date 2020/3/30 19:45
 */
public class LolGame extends Game {
    @Override
    public void initialize() {
        System.out.println("LOL initialize");
    }

    @Override
    public void startGame() {
        System.out.println("LOL startGame");
    }

    @Override
    public void endGame() {
        System.out.println("LOL endGame");
    }
}
