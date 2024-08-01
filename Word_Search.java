
// APPROACH 1 - TIME COMPLEXITY O(N*M*K) -BACKTRACKING APPROACH 


class Solution {
    public boolean search(int i,int j,int m,int n,char[][] board,String word,int k){
        if(k==word.length())
        return true;
        if(i<0 || j<0 || i>=m || j>=n || board[i][j]!=word.charAt(k))
        return false;
        char ch=board[i][j];
        board[i][j]='#';
        boolean right=search(i+1,j,m,n,board,word,k+1);
        boolean down=search(i,j+1,m,n,board,word,k+1);
        boolean up=search(i,j-1,m,n,board,word,k+1);
        boolean left=search(i-1,j,m,n,board,word,k+1);
        board[i][j]=ch;
        return right||left||up||down;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0))
                if(search(i,j,m,n,board,word,0))return true;
            }
        }
        return false;
    }
}

