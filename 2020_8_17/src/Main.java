import java.util.*;

/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str == null){
                System.out.println(true);
                break;
            }
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'){
                    stack.push(str.charAt(i));
                }
                if(str.charAt(i)==')'||str.charAt(i)==']'||str.charAt(i)=='}'){
                    if(stack.empty()){
                        System.out.println(false);                break;

                    }else if(str.charAt(i)==')'&&stack.peek()=='('){
                        stack.pop();
                    }else if(str.charAt(i)==']'&&stack.peek()=='['){
                        stack.pop();
                    }else if(str.charAt(i)==']'&&stack.peek()=='['){
                        stack.pop();
                    }else{
                        System.out.println(false);                break;

                    }
                }
                System.out.println(false);                break;

            }
            if(stack.empty()){
                System.out.println(true);                break;

            }else{
                System.out.println(false);                break;

            }
        }
    }
}*/
public class Main{
    public static void main(String[] args) {

    }
    public boolean isVild(String s){
        if(s.isEmpty()){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c =='('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }else if(stack.empty()||c != stack.pop()){
                return false;
            }
        }
        return stack.empty();
    }
}

/*
class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    */
/** Initialize your data structure here. *//*

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    */
/** Push element x onto stack. *//*

    public void push(int x) {
        queue1.add(x);
        while(!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
        Queue tmp = queue1;
        queue1 = queue2;
        queue2 = tmp;
    }

    */
/** Removes the element on top of the stack and returns that element. *//*

    public int pop() {
        return queue2.poll();
    }

    */
/** Get the top element. *//*

    public int top() {
        return queue2.peek();
    }

    */
/** Returns whether the stack is empty. *//*

    public boolean empty() {
        return queue2.isEmpty();
    }
}

*/
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
class MyQueue {

    private Stack<Integer> a;
    private Stack<Integer> b;
    Queue<Integer> q;
    /** Initialize your data structure here. */
    public MyQueue() {
        Stack<Integer> sd = new Stack<>();
        Deque<Integer> d = new LinkedList<>();
        d.addFirst();
        d.of
        a = new Stack<>();
        b = new Stack<>();
        q = new Queue<Integer>() {
            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return null;
            }

            @Override
            public Integer poll() {
                return null;
            }

            @Override
            public Integer element() {
                return null;
            }

            @Override
            public Integer peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        a.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(b.empty()){
            while(!a.empty()){
                b.push(a.pop());
            }
        }
        return b.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(b.empty()){
            while(!a.empty()){
                b.push(a.pop());
            }
        }
        return b.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return a.empty()&&b.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
int awdawdaw = Integer.MAX_VALUE;
