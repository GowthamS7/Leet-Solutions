class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int s =0;
        int maximum=0;
        int l=0; int r=tokens.length-1;
        while(l<=r){
            if(power>=tokens[l]){power -=tokens[l];s++;l++;maximum = Math.max(maximum, s);
            }else if(s > 0){power +=tokens[r];s--;r--;
        }else{break;}}return maximum;
    }
}