c class Solution {
    public String convert(String s, int numRows) {
        if(numRows < 2)
            return s;
        int numCols = (numRows-2+1)*(s.length()/(numRows + numRows-2) + 1);
        char[][] zigzag = new char[numRows][numCols];
        int c=0;
        int r=0;
        for(int i=0; i<s.length(); i++) {
            zigzag[r][c] = s.charAt(i);
            if(i%(2*numRows-2) < numRows-1)
                r++;
            else {
                r--;
                c++;
            }
        }
        
        String result ="";
        for(int i=0; i<numRows; i++)
            for(int j=0; j<numCols; j++) {
                if(zigzag[i][j] != 0)
                    result += zigzag[i][j];
            }
        
        return result;
    }
}
