

// approach 1 - time complexity -   O(N+M)  and space complexity - O(1)


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        int ind=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j])
            nums1[ind--]=nums1[i--];
            else{
                nums1[ind--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[ind--]=nums2[j--];
        }
    }
}

//In place merging and sorting method 