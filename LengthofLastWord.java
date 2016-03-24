c class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.equals(""))
            return 0;
        int i = s.length() - 1;
        while(i != -1 && s.charAt(i) != ' ') {
            i--;
        }
        return s.length() - 1 - i;
    }
}
