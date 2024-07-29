

// Approach 1 - optimal appraoch

// TIME COMPLEXITY -O(n)

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int maxsum=0;
        int rind=cardPoints.length-1;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxsum=lsum;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum+=cardPoints[rind];
            rind--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}