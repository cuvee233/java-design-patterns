package observer;

/**
 * 测试类
 *
 * @author YuanWei
 * @date 2020/3/30 17:16
 */
public class Client {

    public static void main(String[] args) {

        Subject subject = new Subject();

        ObserverA observerA = new ObserverA(subject);
        ObserverB observerB = new ObserverB(subject);

        subject.addObserver(observerA).addObserver(observerB);

        subject.setMsg("the first message");
        subject.setMsg("the second message");
    }
}
