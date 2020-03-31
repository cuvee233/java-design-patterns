package chain;

/**
 * 实现类
 *
 * @author YuanWei
 * @date 2020/3/31 18:43
 */
public class WarnLogger extends AbstractLogger {

    public WarnLogger(int level) {
        this.level = level;
    }

    @Override
    void writeMessage(String message) {
        System.out.println("WarnLogger " + message);
    }

}
