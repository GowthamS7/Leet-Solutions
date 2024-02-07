class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> m = new HashMap<>();
        for(char ch: s.toCharArray()){
            m.put(ch, m.getOrDefault(ch, 0) +1);
        }
        List<Character> list = new ArrayList(m.keySet());
        list.sort((ob1, ob2) -> m.get(ob2) - m.get(ob1));
        for(char ch: list){
            for(int i = 0; i < m.get(ch); i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}