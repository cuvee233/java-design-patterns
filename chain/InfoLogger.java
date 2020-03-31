package chain;

/**
 * 实现类
 *
 * @author YuanWei
 * @date 2020/3/31 18:43
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    void writeMessage(String message) {
        System.out.println("InfoLogger " + message);
    }

}
