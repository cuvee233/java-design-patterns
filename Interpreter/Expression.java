package Interpreter;

/**
 * 表达式顶级接口
 *
 * @author YuanWei
 * @date 2020/3/31 15:42
 */
public interface Expression {

    boolean interpret(String context);

}
