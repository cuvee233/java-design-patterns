package adapter.object;

/**
 * TODO
 *
 * @author YuanWei
 * @date 2020/4/3 12:01
 */
public class Client {
    public static void main(String[] args) {

        Adapter adapter = new Adapter(new Adaptee());
        adapter.methodA();
        adapter.methodB();


    }
}

