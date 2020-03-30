package mediator;

/**
 * 抽象同事类
 */
public abstract class Colleague {

    public Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 接收
     */
    public abstract void receive();

    /**
     * 发送
     */
    public abstract void send();
}
