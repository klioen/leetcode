c class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        String s = "";
        for(int i = digits.length - 1; i >= 0; i--) {
            int sum = 0;
            if(i == digits.length -1) {
                sum = digits[i] + carry + 1;
            } else
                sum = digits[i] + carry;
            s = sum % 10 + s;
            carry = sum / 10;
        }
        
        if(carry == 1)
            s = 1 + s;
        int[] ret = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            ret[i] = s.charAt(i) - '0';
        }
        return ret;
    }
}
