import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty() &&stack1.empty()){
            return -1;
        }
        if(!stack2.empty()){
            return stack2.pop();
        }
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }

        return stack2.pop();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        System.out.println(arr.size());

        Set<Integer> set = new HashSet<>();

    }
}
