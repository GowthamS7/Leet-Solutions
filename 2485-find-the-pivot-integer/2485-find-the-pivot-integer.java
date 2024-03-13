class Solution {
    public int pivotInteger(int n) {
        int left = 0;
        int right = 0;
        int total = n* (n+1)/2;
        for(int x = 1; x<=n; x++){
            left = x * (x+1)/2;
            right =  total - x* (x-1)/2;
            if(left == right){
                return x;
            }
        }
        return -1;
    }
}