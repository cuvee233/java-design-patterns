package memento;

/**
 * 备忘录角色类
 *
 * @author YuanWei
 * @date 2020/3/31 16:40
 */
public class Memento {

    private String status;

    public Memento() {
    }

    public Memento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
