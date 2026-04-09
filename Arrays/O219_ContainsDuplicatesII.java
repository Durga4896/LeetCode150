public class O219_ContainsDuplicatesII {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        boolean found = false;
        // brute
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    int diff=j-i;
                    if(diff<=k) 
                        found=true;
                        break;
                }
            }
            if(found) break;
        }
        System.out.println(found);

    }
}
