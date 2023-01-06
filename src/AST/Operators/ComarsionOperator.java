package AST.Operators;

import AST.Expression;



public abstract class  ComarsionOperator extends Operator {

    public Expression left;
    public Expression right;
    public boolean result;


    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

}
