package state;

/**
 * TODO
 *
 * @author YuanWei
 * @date 2020/3/31 17:49
 */
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("预定状态");
    }
}
