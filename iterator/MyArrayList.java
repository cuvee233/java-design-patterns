package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanWei
 * @date 2020/3/31 20:32
 */
public class MyArrayList<T> implements MyList<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(list);
    }
}
