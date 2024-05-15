package StackAssignment;


//Write a java program that takes a string of parentheses ((, ), [, ], {, and }) and checks if it is balanced.

import java.util.Stack;

public class BalancedParanthesis {
    private static boolean Balanced(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){

           if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(' ){
               s.push(str.charAt(i));
               continue;
           }
           if(s.empty()) return false;
           if(str.charAt(i)==')'){
               if(s.peek()=='(') s.pop();
               else return false;
           }
            if(str.charAt(i)=='}'){
                if(s.peek()=='{') s.pop();
                else return false;
            }
            if(str.charAt(i)==']'){
                if(s.peek()=='[') s.pop();
                else return false;
            }

        }

        return s.empty();
    }

    public static void main(String[] args) {
        String s="(()[]{})";
        if(Balanced(s)){
            System.out.println("Balanced");
        }else System.out.println("not Balanced");
    }
}
