package iterator;

/**
 * 容器接口
 */
public interface MyList<T> {

    /**
     * 添加一个元素
     *
     * @param t 元素对象
     */
    void add(T t);

    /**
     * 移除一个元素
     *
     * @param t 元素对象
     */
    void remove(T t);

    /**
     * 获取容器的迭代器
     *
     * @return 迭代器对象
     */
    Iterator<T> iterator();
}
