package iterator;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 迭代器实现类
 *
 * @author YuanWei
 * @date 2020/3/31 20:08
 */

public class ListIterator<T> implements Iterator<T> {

    private List<T> list;

    public ListIterator(List<T> list) {
        this.list = list;
    }

    private AtomicInteger cursor = new AtomicInteger();

    @Override
    public boolean hasNext() {
        return cursor.get() < list.size();
    }

    @Override
    public T next() {
        T t = null;
        if (hasNext()) {
            t = list.get(cursor.get());
            cursor.incrementAndGet();
        }
        return t;
    }
}
