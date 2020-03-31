package iterator;

/**
 * 迭代器接口
 *
 * @author YuanWei
 * @date 2020/3/31 20:03
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
