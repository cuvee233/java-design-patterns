package adapter.object;

/**
 * 对象的适配器模式不是使用继承关系连接到Adaptee类，而是使用委派关系连接到Adaptee类。
 *
 * @author YuanWei
 * @date 2020/4/3 11:59
 */
public class Adaptee {

    public void methodA() {
        System.out.println("Adaptee methodA");
    }

}
