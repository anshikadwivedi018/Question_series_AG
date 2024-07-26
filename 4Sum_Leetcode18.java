
// APPROACH 1 - BRUTE FORCE - TIME COMPLEXITY - O(N*N*N*N)

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>>al=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                for(int k=j+1;k<nums.length-1;k++){
                    for(int m=k+1;m<nums.length;m++){
                        List<Integer>lis=new ArrayList<>();
                        if(nums[i]+nums[j]+nums[k]+nums[m]==target){
                        lis.add(nums[i]);lis.add(nums[j]);lis.add(nums[k]);lis.add(nums[m]);
                        Collections.sort(lis);
                        al.add(lis);
                        }
                    }
                }
            }
        }
        List<List<Integer>>ans=new ArrayList<>(al);
        return ans;
    }
}

// THE ABOVE APPROACH GIVES TIME LIMIT EXCEEDED (TLE) FOR LARGE TEST CASES


// APPROACH 2 - BETTER APPPROACH - TIME COMPLEXITY - o(N*N*N)

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Set<List<Integer>>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long>se=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    long comp=target-sum;
                    if(se.contains(comp)){
                        List<Integer>t=new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        t.add((int)comp);
                        t.sort(Integer::compareTo);
                        hs.add(t);
                    }
                    se.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>>ans=new ArrayList<>(hs);
        return ans;
    }
}


// APPROACH 3 - TIME COMPLEXITY - O(N*N)