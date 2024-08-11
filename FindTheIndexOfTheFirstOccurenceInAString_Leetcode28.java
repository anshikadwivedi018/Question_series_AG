// APPROACH 1 - TIME COMPLEXITY - O(N*M)
// USING TWO POINTERS APPROACH


class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        for(int i=0;i<=m-n;i++){
            int j=0;
            while(j<n && haystack.charAt(i+j)==needle.charAt(j))
            j++;
            if(j==n)
            return i;
        }
        return -1;
    }
}



// APPROACH 2 - TIME COMPLEXITY - O(N)
// USING INDEXOF FUNCTION


class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}