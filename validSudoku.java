c class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Character> map = null;
        //rows
        for(int i = 0; i < 9; i++) {
            map = new HashMap<Character, Character>();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.' && map.containsKey(board[i][j]))
                    return false;
                else if(board[i][j] != '.')
                    map.put(board[i][j], '0');
            }
        }
        
        //columns
        for(int i = 0; i < 9; i++) {
            map = new HashMap<Character, Character>();
            for(int j = 0; j < 9; j++) {
                if(board[j][i] != '.' && map.containsKey(board[j][i]))
                    return false;
                else if(board[j][i] != '.')
                    map.put(board[j][i], '0');
            }
        }
        
        //blocks
        for(int i = 0; i < 7; i = i + 3)
            for(int j = 0; j < 7; j = j + 3) {
                map = new HashMap<Character, Character>();
                for(int m = i; m < i + 3; m ++)
                    for(int n = j; n < j + 3; n++) {
                        if(board[m][n] != '.' && map.containsKey(board[m][n]))
                            return false;
                        else if(board[m][n] != '.')
                            map.put(board[m][n], '0');       
                    }
            }
        
        return true;
    }
}
