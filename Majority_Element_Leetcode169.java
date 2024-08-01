
// APPROACH 1 - USING HASHMAP - TIME COMPLEXITY - O(N)
// SPACE COMPLEXITY - O(N)

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        int res=0,m=0;
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
            if(mp.get(i)>m){
            res=i;
            m=mp.get(i);
        }
    }
    return res;
    }
}



// APPROACH 2 - TIME COMPLEXITY - O(N)
// SPACE COMPLEXITY - O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(m==0)
            res=nums[i];
            if(nums[i]==res)
            m+=1;
            else
            m-=1;
        }
        return res;
    }
}

// In this we calculate majority of each element and return element with maximum majority
