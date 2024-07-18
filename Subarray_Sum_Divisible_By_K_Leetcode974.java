
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


// AAPPROACH 2 - USING HASHMAP ( O(N) ) 

class Solution {
    public int subarraysDivByK(int[] nums, int k){
        int ps=0,ans=0;
        Map<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            ps=(ps+nums[i]%k+k)%k;
            ans+=mp.getOrDefault(ps,0);
            mp.put(ps,mp.getOrDefault(ps,0)+1);
        }
        return ans;
    }
}