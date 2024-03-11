class Solution {
    public int rob(int[] nums) {
        int prevmax = 0;
        int currmax = nums[0];
        for(int i=1; i<nums.length; i++){
            int temp = currmax;
            currmax=Math.max(prevmax+nums[i],currmax);
            prevmax = temp;
        }
        return currmax;
    }
}