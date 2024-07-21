public class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long mini=Long.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            int c=a.get(i+m-1)-a.get(i);
            mini=(long)Math.min(mini,c);
        }
        return mini;
    }
} 
    

