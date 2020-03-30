package mediator;

/**
 * 中介者抽象类
 */
public abstract class Mediator {

    public abstract void register(Colleague colleague);

    /**
     * 转发
     *
     * @param colleague
     */
    public abstract void relay(Colleague colleague);
}
