package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件类
 *
 * @author YuanWei
 * @date 2020/3/30 16:56
 */
class Subject {

    /**
     * 观察者集合
     */
    private List<Observer> observers = new ArrayList<>();
    /**
     * 消息
     */
    private String msg;

    protected String getMsg() {
        return this.msg;
    }

    protected void setMsg(String msg) {
        this.msg = msg;
        this.notifyObserver();
    }

    /**
     * 添加观察者
     *
     * @param observer 观察者对象
     */
    protected Subject addObserver(Observer observer) {
        if (observer != null) {
            this.observers.add(observer);
        }
        return this;
    }

    /**
     * 发送通知
     */
    private void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
