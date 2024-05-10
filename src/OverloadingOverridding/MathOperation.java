package OverloadingOverridding;

/* Create a Java class MathOperations with methods for basic mathematical operations such as add() , subtract() , multiply() , and divide() . Implement method overloading to allow these operations for integers, doubles, and optionally, other types.*/


class Operation{
    void add(int a, int b){
        System.out.println("int Value:"+(a+b));
    }
    void add(double a, double b){
        System.out.println("double Value:"+(a+b));
    }
    void add(float a, float b){
        System.out.println("float Value:"+(a+b));
    }
    void subtract(int a, int b){ System.out.println("int Value:"+(a-b)); }
    void subtract(double a, double b){ System.out.println("double Value:"+(a-b)); }
    void subtract(float a, float b){ System.out.println("float Value:"+(a-b)); }
    void multiply(int a, int b){ System.out.println("int Value:"+(a*b)); }
    void multiply(double a, double b){ System.out.println("double Value:"+(a*b)); }
    void multiply(float a, float b){ System.out.println("float Value:"+(a*b)); }

    void divide(int a, int b){ System.out.println("int Value:"+(a/b)); }
    void divide(double a, double b){ System.out.println("double Value:"+(a/b)); }
    void divide(float a, float b){ System.out.println("float Value:"+a/b); }

}
public class MathOperation {
    public static void main(String[] args) {
        Operation p=new Operation();
        p.add(2.5,3.5);
        p.divide(35, 2);
        p.subtract(3.4, 5.4);
        p.multiply(3.5f, 4.5f);
    }
}
