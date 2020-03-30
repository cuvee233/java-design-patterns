package mediator;

public class ConcreteColleague3 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类3收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类3发送请求。");
        mediator.relay(this);
    }
}
