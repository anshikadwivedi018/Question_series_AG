// APPROACH 1 - TIME COMPLEXITY - O(N*N)

class Solution 
{ 
    int sameChar(String A, String B) 
    {
        // code here
        A=A.toLowerCase();
        B=B.toLowerCase();
        int c=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==B.charAt(i))
            c++;
        }
        return c;
    }
} 