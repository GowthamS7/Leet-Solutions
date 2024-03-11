class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List > AG = new HashMap<>();
        for( String str : strs){
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String SortedS = new String(ca);
            if(AG.containsKey(SortedS)){
                AG.get(SortedS).add(str);
            }else{
                List<String> Al = new ArrayList<>();
                Al.add(str);
                AG.put(SortedS, Al);
            }
        }
        return new ArrayList(AG.values());
    }
}