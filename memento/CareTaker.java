package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 守护者对象，负责管理备忘录对象的拷贝对象
 *
 * @author YuanWei
 * @date 2020/3/31 16:58
 */
class CareTaker<T> {

    private List<T> list = new ArrayList<>();

    /**
     * 存储快照
     *
     * @param t 类型
     */
    void addSnap(T t) {
        list.add(t);
    }

    /**
     * 获取快照
     *
     * @param index
     * @return
     */
    T getSnap(int index) {
        return list.get(index);
    }
}
