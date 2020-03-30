package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者类
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> list = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!list.contains(colleague)) {
            list.add(colleague);
            colleague.setMediator(this);
        }
    }

    /**
     * 转发消息
     *
     * @param colleague 同事类
     */
    @Override
    public void relay(Colleague colleague) {
        for (Colleague ob : list) {
            if (!ob.equals(colleague)) {
                ob.receive();
            }
        }
    }
}
