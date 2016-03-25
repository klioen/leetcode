c class Solution {
    public String addBinary(String a, String b) {
        String ret = "";
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0 || j >= 0) {
            int aDigit = 0;
            int bDigit = 0;
            if(i < 0) {
                aDigit = 0;
                bDigit = b.charAt(j) - '0';
            }
            else if(j < 0) {
                aDigit = a.charAt(i) - '0';
                bDigit = 0;
            }
            else {
                aDigit = a.charAt(i) - '0';
                bDigit = b.charAt(j) - '0';
            }
            int sum = aDigit + bDigit + carry;
            ret = sum % 2 + ret;
            carry = sum / 2;
            i--;
            j--;
        }
        if(carry == 1)
            ret = 1 + ret;
        return ret;
    }
}
