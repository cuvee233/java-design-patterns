package observer;

/**
 * 观察者实现类
 *
 * @author YuanWei
 * @date 2020/3/30 17:10
 */
public class ObserverA extends Observer {

    public ObserverA(Subject subject) {
        this.subject = subject;
    }

    @Override
    protected void update() {
        System.out.println(subject.getMsg());
    }
}
