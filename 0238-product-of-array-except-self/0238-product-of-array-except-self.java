class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] prefixproducts = new int[n];
        prefixproducts[0] = 1;
        int [] sufixproducts = new int[n];
        for(int i=1; i<n; i++){
            prefixproducts[i] = prefixproducts[i-1] * nums[i-1];
        }
        sufixproducts[n-1] = 1;
        for(int i = n-2; i>=0; i--){
            sufixproducts[i] = sufixproducts[i+1] * nums[i+1];
            prefixproducts[i] *= sufixproducts[i];
        }
        return prefixproducts;
    }
}