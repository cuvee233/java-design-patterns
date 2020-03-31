package state;

/**
 * 酒店房间
 *
 * @author YuanWei
 * @date 2020/3/31 17:50
 */
public class HotelRoom {

    private String roomNum;

    private State state;

    public HotelRoom(String roomNum) {
        this.roomNum = roomNum;
    }

    public HotelRoom() {
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("房间状态修改");
        state.handle();
    }
}
