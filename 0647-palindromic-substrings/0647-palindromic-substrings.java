class Solution {
    public int countSubstrings(String s) {
        int count =0;
        int n = s.length();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            count += palindromesubstring(s,i,i);
            count += palindromesubstring(s,i,i+1);
        }
        return count;
    }
    public int palindromesubstring(String s, int left, int right){
        int count =0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}