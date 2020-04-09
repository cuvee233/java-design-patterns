package adapter.interfaceA;

/**
 * 接口适配器，adapter为抽象类，默认空实现当前接口所有方法，其它子类按需实现adapter方法
 *
 * @author YuanWei
 * @date 2020/4/3 16:57
 */
public class Client {

    public static void main(String[] args) {

        InterfaceWrapper sourceSubA = new SourceSubA();

        sourceSubA.methodA();
    }

}
