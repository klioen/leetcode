public class Solution {
    public int reverse(int x) {
        int[] temp = new int[10]; 
        int i=0;
        long result = 0;
        while(x != 0) {
            int t = x%10;
            result = result*10 + t;
            x = x/10;
        }

        int flag = 1;
        if(x < 0) 
        result = -result;
        
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }
        
        return (int)result;
    }
}