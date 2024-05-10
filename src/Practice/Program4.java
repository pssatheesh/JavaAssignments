package Practice;

public class Program4 {
    public static void main(String[] args) {
        String exp="13+";
        int i=0, sum=0;
        for(i=0;i<exp.length();i++){
            if(exp.charAt(i)=='+'){
                if(exp.charAt(i-1)>='0' && exp.charAt(i-1)<=9){
                    sum=exp.charAt(i-1)+exp.charAt(i)+exp.charAt(i-2)-48;
                }
            }
        }
        System.out.println(sum);
    }
}
