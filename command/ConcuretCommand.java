package command;

/**
 * 命令实现类
 *
 * @author YuanWei
 * @date 2020/4/3 10:53
 */
public class ConcuretCommand implements Command {

    Receiver receiver;

    public ConcuretCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.receive();
    }
}
