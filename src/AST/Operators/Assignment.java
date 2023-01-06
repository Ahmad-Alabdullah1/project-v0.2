package AST.Operators;

import AST.Expression;
import AST.Statment;

public class Assignment extends Operator {

    String left ;
    Expression right;

    Assignment ( String left , Expression right )
    {
        this.left = left;
        this.right = right;
    }


    @Override
    public String toString() {
        return "Assignment{" +
                "left='" + left + '=' +
                ", right=" + right +
                '}';
    }
}
