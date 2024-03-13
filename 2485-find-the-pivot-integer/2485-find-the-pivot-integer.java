class Solution {
    public int pivotInteger(int n) {
        int left = 0;
        int right = 0;
        for(int x = 1; x<=n; x++){
            left = x * (x+1)/2;
            right = n* (n+1)/2 - x* (x-1)/2;
            if(left == right){
                return x;
            }
        }
        return -1;
    }
}