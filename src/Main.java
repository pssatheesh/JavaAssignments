import java.util.HashMap;
import java.util.Map;

public class Main {
    static public int thirdMax(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }else if(nums[i]==nums[j]){
                    nums[i]=0;
                }
            }
        }
        if(nums.length>3){
            return nums[nums.length-3];
        }else{
            return nums[nums.length-1];
        }
    }
    public static void main(String[] args) {
        int []arr={2,2,3,1};
        System.out.println(thirdMax(arr));


    }
}