package adapter.object;

/**
 * TODO
 *
 * @author YuanWei
 * @date 2020/4/3 11:59
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void methodA() {
        adaptee.methodA();
    }

    @Override
    public void methodB() {
        System.out.println("Adapter methodB");
    }
}
