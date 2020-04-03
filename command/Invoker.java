package command;

/**
 * 调用者
 *
 * @author YuanWei
 * @date 2020/4/3 10:59
 */
public class Invoker {

    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
