// APPROACH 1

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length && j<nums.length){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i+=1;
            }
            j+=1;
        }
    }
}

// APPROACH 2

class Solution {
    public void moveZeroes(int[] nums) {
        int cz=0;
        List<Integer>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            cz+=1;
            else
            al.add(nums[i]);
        }
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            nums[ind]=al.get(ind++);
        }
        for(int i=nums.length-cz;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
