package Interpreter;

/**
 * 解释器
 *
 * @author YuanWei
 * @date 2020/3/31 15:44
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context != null && context.contains(data)) {
            return true;
        }
        return false;
    }
}
