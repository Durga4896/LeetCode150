import java.util.Arrays;

public class O189_RotateArray{
    public static void main(String[] dspy){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        int n = nums.length;   
        k %= n;
        
        int start = 0, end = n-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
         start = 0; end = k-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        start = k; end = n-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}   