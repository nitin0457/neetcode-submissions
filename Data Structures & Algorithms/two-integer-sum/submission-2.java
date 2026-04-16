class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        int sum=0;
        int ans[]=new int[2];
        Arrays.fill(ans, -1);
        for(int i=0; i<nums.length; i++){
            int diff=target-nums[i];
            if(map.containsKey(diff) && i!=map.get(diff)){
                ans[0]=i;
                ans[1]=map.get(diff);
                break;
            }
        }
        return ans;
    }
}
