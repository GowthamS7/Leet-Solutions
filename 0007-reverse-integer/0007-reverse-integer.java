class Solution {
    public int reverse(int x) {
        StringBuilder st = new StringBuilder();
        st.append(Math.abs(x));
        st.reverse();
        if(st.length() >= 10) {
            int a1 = Integer.parseInt(st.substring(0,5));
            int a2 = Integer.parseInt(st.substring(5,10));
            if (a1 > 21474 || a2 > 83647) {
                return 0;
            }
        }
        int num = Integer.parseInt(st.toString());
            return (x < 0) ? -num : num;
    }
}