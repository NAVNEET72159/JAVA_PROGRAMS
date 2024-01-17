package CodeChefQuestions;

public class validParenthesis {
    public static void main(String[] args) {
        String s = "([)]";
        isValid(s);
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                isValid = false;
                break;
            }
        }
        if(!stack.isEmpty()) {
            isValid = false;
        }
        return isValid;
    }
}
