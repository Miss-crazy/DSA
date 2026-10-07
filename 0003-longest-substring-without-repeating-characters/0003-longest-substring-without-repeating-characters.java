class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
        int left =0;
        int maxi=0;
        for(int right=0;right<s.length();right++){
            char ele = s.charAt(right);

            while(map.contains(ele)){
                map.remove(s.charAt(left));
                left++;
            }

            map.add(ele);
            maxi = Math.max(maxi , right-left+1);

        }

        return maxi;
    }
}