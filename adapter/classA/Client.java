package adapter.classA;

/**
 * 类适配器，adapter通过继承当前类实现另外一个扩展方法接口，来实现对类功能的增强
 *
 * @author YuanWei
 * @date 2020/4/3 11:55
 */
public class Client {

    public static void main(String[] args) {

        Target target = new Adapter();

        target.methodA();
        target.methodB();

    }

}
