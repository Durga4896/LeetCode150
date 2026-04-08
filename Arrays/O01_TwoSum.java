//import java.util.Arrays;
import java.util.HashMap;
public class O01_TwoSum {
    public static void main(String[] args){
        HashMap<Integer, Integer> ts = new HashMap<>();
        int[] nums = {2,7,11,15};
        int target = 9;

        for(int i=0; i<nums.length; i++){
            if(ts.containsKey(nums[i])){
                System.out.println("["+ts.get(nums[i])+","+i+"]");
            }else{
                ts.put(target - nums[i], i);
            }
        }

        // int[] nums = {2,7,11,15};
        // int target = 17;

        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             System.out.println(Arrays.toString(new int[]{i,j}));
        //         }
        //     }
        // }
    }
}
