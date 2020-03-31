package memento;

/**
 * TODO
 *
 * @author YuanWei
 * @date 2020/3/31 17:17
 */
public class Client {

    public static void main(String[] args) {

        CareTaker<Memento> taker = new CareTaker<>();

        Originator oringinator = new Originator("HP: 100");

        taker.addSnap(oringinator.saveMento());
        System.out.println("Before the battle " + oringinator);
        oringinator.setStatus("HP: 70");

        System.out.println("After the battle " + oringinator);

        oringinator.getMento(taker.getSnap(0));
        System.out.println("rollback " + oringinator);
    }

}
