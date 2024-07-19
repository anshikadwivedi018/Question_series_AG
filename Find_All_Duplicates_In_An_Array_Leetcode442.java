
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


// APPROACH 2 - using HashSet - Time complexity- O(N) and Space complexity - O(N)

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al=new ArrayList<>();
        Set<Integer> se=new HashSet<>();
        for(int i: nums){
            if(se.contains(i))
            al.add(i);
            se.add(i);
        }
        return al;
    }
}

// APPROACH 3 - BEST APPROACH - TIME COMPLEXITY -O(N) AND SPACE COMPLEXITY - O(1)

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int ind=Math.abs(nums[i])-1;
            if(nums[ind]<0)
            al.add(Math.abs(nums[i]));
            nums[ind]=-nums[ind];
        }
        return al;
    }
}