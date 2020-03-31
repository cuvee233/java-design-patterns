package memento;

/**
 * TODO
 *
 * @author YuanWei
 * @date 2020/3/31 17:24
 */
public class Originator {

    private String status;

    public Originator(String status) {
        this.status = status;
    }

    public Originator() {
    }

    public Memento saveMento() {
        return new Memento(this.status);
    }

    public void getMento(Memento memento) {
        this.status = memento.getStatus();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "status='" + status + '\'' +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
