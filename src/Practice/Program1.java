package Practice;

import java.util.Scanner;

/*Given a number, the task is that we divide number by 3. The input number may be large and it may not be possible to store even if we use long long int.
Sample 1 - Input  : n = 769452
Output : Yes

Sample 2 - Input  : n = 123456758933312
Output : No

Sample 3 - Input  : n = 3635883959606670431112222
Output : Yes*/
public class Program1 {
    public static void main(String[] args) {
        //long l=3635883959606670431112222l;
        String input="3635883959606670431112222";
        int sum=0;
        for(int i=0;i<input.length();i++){
            int temp=input.charAt(i)-48;
            //int temp=Integer.parseInt(input.charAt(i));
            sum+=temp;
        }
        if(sum%3==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
