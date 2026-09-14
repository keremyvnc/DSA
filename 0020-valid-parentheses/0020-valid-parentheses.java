class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> m = new HashMap<>();
        m.put('(',')');
        m.put('[',']');
        m.put('{','}');
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') stack.push(c);
            
            else {
                if (stack.isEmpty() || c != m.get(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }
}