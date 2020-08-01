import java.util.Stack;
public class Parenthesis {
    public boolean chkParentheses(String A,int n){
        Stack<Character> stack = new Stack<>();
        if(A == null&&n!=0){
            return false;
        }
        for(int i = 0;i < n;i++){
            if(A.charAt(i) == '('){
                stack.push('(');
            }else if (A.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
