class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total_sum=0 , n = cardPoints.length;
        for(int i=0;i<n;i++){
            total_sum+=cardPoints[i];
        }
        int win_sum=0;
        int win_size=n-k;

        for(int i=0;i<win_size;i++){
            win_sum+= cardPoints[i];
        }

        int min_sum=win_sum;

        for(int right=win_size;right<n;right++){
            win_sum+=cardPoints[right];
            win_sum-=cardPoints[right-win_size];

            min_sum = Math.min(min_sum , win_sum);
        }

        return total_sum - min_sum;
        
    }
}