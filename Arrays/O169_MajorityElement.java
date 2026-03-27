public class O169_MajorityElement {
    public static void main(String[] dspy){
        int nums[] = {2,2,1,1,1,2,2};
        int count = 0;
        int majority = 0;
        for(int i=0; i<nums.length;i++){
            if(count == 0){
                majority = nums[i];
            }
            if(majority == nums[i]){
                count++;
            } else{
                count--;
            }
        }
        System.out.println(majority);
    }
}
