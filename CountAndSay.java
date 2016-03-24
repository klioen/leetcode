c class Solution {
    public String countAndSay(int n) {
        String ret = "";
        if(n == 1)
            ret = "1";
        else {
            String temp = countAndSay(n-1);
            int count = 1;
            for(int i = 1; i < temp.length(); i++) {
                if(temp.charAt(i) != temp.charAt(i-1)) {
                    ret = ret + count + temp.charAt(i-1);
                    count = 1;
                    continue;
                }
                count ++;
            }
            ret = ret + count + temp.charAt(temp.length() - 1);
        }
        
        return ret;
    }
}
