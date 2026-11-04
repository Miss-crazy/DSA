class Solution {
    public boolean canJump(int[] nums) {
        int far = 0 , n = nums.length;

        for(int i=0;i<n;i++){
            if(far>=n-1) return true;
            if(i>far) return false;
            far = Math.max(far , i+ nums[i]);
        }
        return true;
    }
}