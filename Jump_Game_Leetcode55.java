
// APPROACH 1 - TIME COMPLEXITY - O(N)


class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)
        return true;
        int maxInd=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxInd)
            return false;
            maxInd=Math.max(maxInd,i+nums[i]);
        }
        return true;
    }
}

// 1) This is the greedy approach.
// 2) First initialize the maxInd=0.
// 3) Run a loop from 0 to nums.length and then check if (i>maxInd) if so then return false directly
// 4) else keep updating the maxInd 
// 5) maxInd = Math.max(maxInd, i+nums[i])
// 6) return the maxInd.