class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0,right =0, total = 0 , len = s.length();
        int[] freq = new int[3];

        while(right<len){
            char curr = s.charAt(right);
            freq[curr-'a']++;

            while(valid(freq)){
                total += len-right;

                char leftchar = s.charAt(left);
                freq[leftchar - 'a']--;
                left++;
            }
            right++;
        }
        return total;
    }

    public boolean valid(int[] freq){
        return freq[0]>0 && freq[1]>0 && freq[2]>0;
    }
}