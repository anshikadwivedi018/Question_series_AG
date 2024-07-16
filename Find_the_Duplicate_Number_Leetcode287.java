// APPROACH 1

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            return nums[i];
        }
        return -1;
    }
}


// APPROACH 2

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int x:nums){
            if(hs.contains(x))
            return x;
            hs.add(x);
        }
        return -1;
    }
}


// APPROACH 3

class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            int ind = Math.abs(nums[i]);
            if(nums[ind] < 0) {
                return ind;
            }
            nums[ind] = -nums[ind];
        }
        return -1;
    }
}