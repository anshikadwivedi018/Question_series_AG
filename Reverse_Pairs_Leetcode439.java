
// APPROACH 1 - BRUTE FORCE APPROACH - TIME COMPLEXITY - O(N*N)


class Solution {
    public int reversePairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((long)nums[i]>(2*(long)nums[j]))
                c++;
            }
        }
        return c;
    }
}


// APPROACH 2 - OPTIMIZED APPROACH 