
// APPROACH 1 - O(N * LOG(N)) - BRUTE FORCE - USING SORTING

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>al=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            al.add(nums[i]);
        }
        return al;
    }
}


// APPROACH 2 - 