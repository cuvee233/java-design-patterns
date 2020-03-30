package strategy;

/**
 * 策略模式顶级接口
 *
 * @author YuanWei
 * @date 2020/3/30 17:34
 */
public interface Comparator<T> {

    boolean compare(T a, T b);

}
