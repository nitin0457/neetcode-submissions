class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=1; i<100000; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}