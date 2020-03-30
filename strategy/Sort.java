package strategy;

import java.util.List;

/**
 * 排序
 *
 * @author YuanWei
 * @date 2020/3/30 17:50
 */
class Sort<T> {

    /**
     * 冒泡排序
     *
     * @param list
     * @param c
     */
    protected void sort(List<T> list, Comparator<T> c) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (c.compare(list.get(j), list.get(j + 1))) {
                    swap(list, j, j + 1);
                }
            }
        }
    }

    /**
     * 交换参数
     */
    private void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
