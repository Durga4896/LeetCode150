public class O80_RemoveDuplicatesII {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int i = 0;
        for(int n : nums){
            if(i<2 || n != nums[i-2]){
                nums[i++] = n;
            }
        }
        System.out.println(i);
    }
}
