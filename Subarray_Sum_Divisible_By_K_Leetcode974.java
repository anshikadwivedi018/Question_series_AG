
// APPROACH 1 - O (N * N) - THIS APPROACH GIVES TIME LIMIT EXCEEDED (TLE)

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    c++;
                }
            }
        }
        return c;
    }
}