package CombinedAssignment_1;

public class P1_AverageWeight {
    public static void main(String[] args) {
        double []weight10={35.4,40,65,56,44.5,28,60,85,45.4,53.4};
        //consider the weight values as point also
        double Average=0, sum=0;
        for(int i=0;i<weight10.length;i++){
            sum+=weight10[i];
        }
        Average=sum/weight10.length;
        System.out.println("Average of 10 peoples is");
        System.out.printf("%.2f",Average);
    }
}
