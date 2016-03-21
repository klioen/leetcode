c class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if(c == ')' || c == ']' || c == '}') {
                if(stack.empty())
                    return false;
                char top = (char)stack.peek();
                if(c == ')' && top == '(' || c == ']' && top == '[' || c == '}' && top == '{')
                    stack.pop();
                else
                    return false;
            }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
}
