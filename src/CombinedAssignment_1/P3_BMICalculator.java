package CombinedAssignment_1;
/*In the BMI calculator program done in Java Assignment 2, write methods to get height and weight for 2 or more persons and compare their BMIs.
 */
import java.util.Scanner;

public class P3_BMICalculator {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of people compared");
        int n= scan.nextInt();
        String []name=new String[n];
        float []result=new float[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Name: ");
            name[i]=scan.next();
            System.out.println("Enter the weight in kg: ");
            float weight=scan.nextFloat();
            System.out.println("Enter the height in cm: ");
            int height=scan.nextInt();
            float m=height/100.0f;
            float bmi=weight/(m*m);
            result[i]=bmi;
        }
        for(int i=0;i<result.length-1;i++){
            if(result[i]<result[i+1]) {
                float temp = result[i];
                result[i] = result[i + 1];
                result[i + 1] = temp;
                String temp1 = name[i];
                name[i] = name[i + 1];
                name[i + 1] = temp1;

            }
        }

        for(int i=0;i<result.length;i++){
            if(result[i]<18.5){
                System.out.println(name[i]+" "+result[i]+" Underweight");
            }else if(result[i]>18.5 && result[i]<24.9){
                System.out.println(name[i]+" "+result[i]+" is Normal");
            }else if(result[i]>25){
                System.out.println(name[i]+" "+result[i]+" is overweight");
            }
        }

    }
}
