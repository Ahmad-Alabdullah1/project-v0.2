package AST.Operators;

import AST.Expression;

public  class NotEqual extends ComarsionOperator {


NotEqual (Expression left , Expression right , boolean result)
{
    this.left = left;
    this.right =right;
    this.result =result;


}

}
