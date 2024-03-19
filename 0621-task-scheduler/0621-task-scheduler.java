class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] freq = new int[26];
        for(char task :tasks){
            freq[task - 'A']++;
        }
        Arrays.sort(freq);
        int chunk = freq[25] -1;
        int ideal = chunk *n;
        for(int i=24; i>=0; i--){
            ideal -= Math.min(chunk, freq[i]);
        }
        return ideal < 0 ? tasks.length : tasks.length + ideal;
    }
}