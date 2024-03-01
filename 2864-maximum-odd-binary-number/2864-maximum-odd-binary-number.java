class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int c=0;
        for(int i=0; i<n; i++){if(s.charAt(i) == '1'){c++;}}
        StringBuilder r = new StringBuilder();
        for(int i=0; i<n; i++){r.append('0');}
        r.setCharAt(n-1, '1');
        for(int i=0; i<c-1; i++){r.setCharAt(i, '1');}
        return r.toString();}}