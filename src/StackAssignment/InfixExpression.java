package StackAssignment;

import java.util.Stack;


//Write a function that converts an infix expression (e.g., a + b * c) to postfix notation (e.g., a b c * +)


public class InfixExpression {
    private static String infix(String exp){
        Stack<Character> s=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            switch (ch){
                case '+':
                case '-':
                case '*':
                case '/':
                    s.push(ch);
                    break;
                default:
                    res.append(ch);
                    break;
            }
        }
        while(!s.isEmpty()){
            res.append(s.pop());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(infix("a+b*c"));
    }
}
