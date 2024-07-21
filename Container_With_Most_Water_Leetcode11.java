// APPROACH 1 - BRUTE FORCE - TIME COMPLEXITY - O(N * N)

class Solution {
    public int maxArea(int[] height) {
        int maxa=Integer.MIN_VALUE;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                maxa=Math.max((Math.min(height[i],height[j])*(j-i)),maxa);
            }
        }
        return maxa;
    }
}

// ABOVE SOLUTION GIVES TIME LIMIT EXCEEDED (TLE) FOR LARGE TEST CASES


// APPROACH 2 - OPTIMIZED - TIME COMPLEXITY - O(N)

class Solution {
    public int maxArea(int[] height) {
        int maxa=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            if(height[i]<height[j]){
                maxa=Math.max(maxa,(height[i]*(j-i)));
                i++;
            }
            else{
                maxa=Math.max(maxa,(height[j]*(j-i)));
                j--;
            }
        }
        return maxa;
    }
}