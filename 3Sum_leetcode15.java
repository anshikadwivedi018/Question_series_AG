// APPROACH 1 - BRUTE FORCE - TIME COMPLEXITY - O(N*N*N)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>al=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer>lis=new ArrayList<>();
                    lis.add(nums[i]);
                    lis.add(nums[j]);
                    lis.add(nums[k]);
                    lis.sort(Integer::compareTo);
                    if (!al.contains(lis)) {
                        al.add(lis);
                    }
                }
            }
        }
    }
    return al;
    }
}

// THE ABOVE APPROACH GIVES TIME LIMIT EXCEEDED  FOR LARGE TEST CASES