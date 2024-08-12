// APPROACH 1
// TWO POINTER APPROACH IS FOLLOWED 
// TIME COMPLEXITY IS O(N)


class Solution {
    public boolean checkpalin(String s,int st,int e){
        while(st<e){
            if(s.charAt(st)!=s.charAt(e))
            return false;
            st++;
            e--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int st=0;
        int e=s.length()-1;
        while(st<e){
            if(s.charAt(st)!=s.charAt(e))
            return checkpalin(s,st+1,e) || checkpalin(s,st,e-1);
            else{
                st++;
                e--;
            }
        }
        return true;
    }
}



