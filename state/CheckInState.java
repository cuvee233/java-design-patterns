package state;

/**
 * TODO
 *
 * @author YuanWei
 * @date 2020/3/31 17:50
 */
public class CheckInState implements State {
    @Override
    public void handle() {
        System.out.println("入住状态");
    }
}
