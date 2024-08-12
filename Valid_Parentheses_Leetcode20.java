// APPROACH 1 - TIME COMPLEXITY - O(N) AND SPACE COMPLEXITY - O(N)
// USING STACK DATA STRUCTURE

class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            st.push(s.charAt(i));
            else if(s.charAt(i)==')' && !st.isEmpty() && st.peek()=='(')
            st.pop();
            else if(s.charAt(i)=='}' && !st.isEmpty() && st.peek()=='{')
            st.pop();
            else if(s.charAt(i)==']' && !st.isEmpty() && st.peek()=='[')
            st.pop();
            else
            return false;
        }
        return st.isEmpty();
    }
}