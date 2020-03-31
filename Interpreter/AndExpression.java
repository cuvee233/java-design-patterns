package Interpreter;

/**
 * @author YuanWei
 * @date 2020/3/31 15:47
 */
public class AndExpression implements Expression {

    Expression expressionA;
    Expression expressionB;

    public AndExpression(Expression a, Expression b) {
        this.expressionA = a;
        this.expressionB = b;
    }

    @Override
    public boolean interpret(String context) {
        // 调用最终表达式结果
        return expressionA.interpret(context) && expressionB.interpret(context);
    }
}
