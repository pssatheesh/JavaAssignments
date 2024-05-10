package Practice;

public class Program2 {
   /* public static void subsequence(String s, int i){
        int count=0;
        System.out.println(s.substring(count,i));
        count++;
        if(i<s.length() && count<s.length()){
            subsequence(s, i+1);
        }

    }*/
    public static void main(String[] args) {
        String s="abc";
        for(int i=-0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
