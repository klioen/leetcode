c class Solution {
    public int reverse(int x) {
        int[] temp = new int[10]; 
        int i=0;
        while(true) {
            temp[i] = x%10;
            x = x/10;
            if(x == 0)
                break;
            i++;
        }
        long result = 0;
        int flag = 1;
        if(x < 0) 
            flag = -1;
        for(int j=0; j<=i; j++) {
            result += temp[j] * Math.pow(10, i-j);
        }
        result = result * flag;
        
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }
        
        return (int)result;
    }
}
