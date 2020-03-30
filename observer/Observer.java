package observer;

/**
 * 观察者抽象类
 * @author YuanWei
 * @date 2020/3/30 16:55
 */
public abstract class Observer {


    protected Subject subject;

    /**
     * 接收消息
     */
    protected abstract void update();

}
