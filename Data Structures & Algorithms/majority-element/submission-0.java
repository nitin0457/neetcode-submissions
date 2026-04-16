class Solution {
    public int majorityElement(int[] nums) {
        int el=-1;
        int count=0;

        for(int i=0; i<nums.length; i++){
            if(count==0){
                el=nums[i];
                
            }
            if(el==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        int cnt=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==el){
                cnt++;
            }
        }
        if(cnt>nums.length/2){
            return el;
        }
        return 0;
    }
}