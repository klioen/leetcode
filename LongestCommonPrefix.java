c class Solution {
 
    public String longestCommonPrefix(String[] strs) {
        String ret = "";
        if(strs.length == 0)
            return ret;
        String first = strs[0];
        for(int i=0; i < first.length(); i++) {
            int j = 1;
            for(j=1; j < strs.length; j++) {
                if(i < strs[j].length() && strs[j].charAt(i) == first.charAt(i))
                    continue;
                else
                    break;
            }
            if(j == strs.length)
                ret += first.charAt(i);
            else
                break;
        }
        return ret;
    }
}
