// APPROACH 1 (BRUTE FORCE - O(N ^ N))


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}


// APPROACH 2 (OPTIMIZED - USING HASHMAP) - O( N )

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(mp.containsKey(c) && mp.get(c)!=i)
            return new int[]{i,mp.get(c)};
        }
        return new int[]{};
    }
}

