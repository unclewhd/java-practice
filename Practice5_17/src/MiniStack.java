import java.util.Stack;

public class MiniStack {
    private Stack<Integer> stack1;
    private Stack<Integer> minStack;

    public MiniStack(){
        stack1 = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if(minStack.empty()) {
            minStack.push(x);
        }else{
            int top = minStack.peek();
            if(x <= top) {
                minStack.push(x);
            }
        }
    }

    public void pop(){
        if(!stack1.empty()){
            int tmp = stack1.pop();
            if(tmp == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top(){
        if(stack1.empty()) {
            return -1;
        }
        return stack1.peek();
    }

    public int getMin(){
     if(minStack.empty()) {
         return -1;
     }
     return minStack.peek();
    }

}
