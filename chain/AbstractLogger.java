package chain;

/**
 * 日志责任链对象
 *
 * @author YuanWei
 * @date 2020/3/31 18:35
 */
public abstract class AbstractLogger {

    static final int ERROE = 3;
    static final int WARN = 2;
    static final int INFO = 1;

    int level;

    private AbstractLogger nectLogger;

    public void setNext(AbstractLogger nectLogger) {
        this.nectLogger = nectLogger;
    }

    public void handleMessgae(int level, String message) {
        if (level == this.level) {
            writeMessage(message);
        } else {
            nectLogger.handleMessgae(level, message);
        }
    }

    abstract void writeMessage(String message);

}
