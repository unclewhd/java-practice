import java.util.Stack;

public class Myqueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Myqueue(){
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop(){
        if(empty()) {
            return -1;
        }
        if(stack2.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public int peek() {
        if(empty()) {
            return -1;
        }
        if(stack2.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public boolean empty(){
        return stack2.empty() && stack1.empty();
    }
}
