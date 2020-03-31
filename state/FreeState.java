package state;

/**
 * TODO
 *
 * @author YuanWei
 * @date 2020/3/31 17:48
 */
public class FreeState implements State {

    @Override
    public void handle() {
        System.out.println("空闲状态");
    }

}
