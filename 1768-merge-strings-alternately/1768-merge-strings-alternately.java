class Solution {
    public String mergeAlternately(String word1, String word2) {
        int ptr1 = 0;
        int ptr2 = 0;
        StringBuilder merged = new StringBuilder();
        while(ptr1< word1.length() && ptr2< word2.length()){
            merged.append(word1.charAt(ptr1++));
            merged.append(word2.charAt(ptr2++));
        }
        if(ptr1 <word1.length()){
            merged.append(word1.substring(ptr1));
        }if(ptr2 < word2.length()){
            merged.append(word2.substring(ptr2));
        }
        return merged.toString();
    }
}