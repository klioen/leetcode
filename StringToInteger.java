class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        int flag = 1;
        long result = 0;
        for(int i=0; i<str.length(); i++) {
            if(i == 0 && str.charAt(0) == '-') {
                flag = -1;
                continue;
            } else if(i == 0 && str.charAt(0) == '+') {
                flag = 1;
                continue;
            }
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9' && result <= Integer.MAX_VALUE) {
                result = result*10 + (str.charAt(i)-'0');
            } else {
                break;
            }
        }
     
        result = flag*result;
        if(result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if(result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int)result;
        }
  
    }
}
