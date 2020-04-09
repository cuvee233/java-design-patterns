package adapter.classA;

/**
 * 类适配器
 *
 * @author YuanWei
 * @date 2020/4/3 11:50
 */
public class Adapter extends Adaptee implements Target {

    /**
     * 扩展之后可以使用methodB方法
     */
    @Override
    public void methodB() {
        System.out.println("Adaptee methodB");
    }

}
