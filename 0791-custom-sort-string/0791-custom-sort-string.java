class Solution {
    public String customSortString(String order, String s) {
        int [] frequency = new int[26];
        for(char ch : s.toCharArray()){
            frequency[ch - 'a']++;
        }
    StringBuilder SortedString = new StringBuilder();
        for(char ch : order.toCharArray()){
            int count = frequency [ch - 'a'];
            while(count -->0){
                SortedString.append(ch);
            }
            frequency[ch - 'a']=0;
        }
        for(char ch ='a'; ch <= 'z'; ch++){
            int count = frequency[ch - 'a'];
            while(count --> 0){
                SortedString.append(ch);
            }
        }
        return SortedString.toString();
    }
}