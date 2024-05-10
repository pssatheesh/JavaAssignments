package CombinedAssignment_1;
/*Write a program with an if statement. Declare one variable inside the if block and another one outside. Print both variables inside and outside the if block to understand variable scope. (Comment the compiler error in your program while submitting)*/
public class P2_Declarevariable {
    public static void main(String[] args) {
        int a=5;
        if(a>0){
            int b=10;
            System.out.println(a+" "+b);
        }
        //System.out.println(a+" "+b);
        System.out.println("Error: java: cannot find symbol b");
    }
}
