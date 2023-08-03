package com.pattern.InterpreterPattern;

public class InterpreterPatternDemo {

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }



    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        System.out.println("John is male? " + isMale.interpret("John"));

    }
}
