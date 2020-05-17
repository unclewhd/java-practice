import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        if (queue1.isEmpty() && !queue2.isEmpty()) {
            queue2.offer(x);
        } else {
            queue1.offer(x);
        }
    }

    public int pop() {
        if (Empty()) {
            return -1;
        }

        int a;
        int q1Size = queue1.size();
        int q2Size = queue2.size();
        if(!queue1.isEmpty()){
            for (int i = 0; i < q1Size - 1; i++){
            queue2.offer(queue1.poll());
            }
            a = queue1.poll();
        }else{
            for (int i = 0; i < q2Size - 1; i++){
                queue1.offer(queue2.poll());
            }
            a = queue2.poll();
        }
        return a;
    }

    public int top() {
        if (Empty()) {
            return -1;
        }

        int a = 0;
        int q1Size = queue1.size();
        int q2Size = queue2.size();
        if(!queue1.isEmpty()){
            for (int i = 0; i < q1Size; i++){
                a = queue1.poll();
                queue2.offer(queue1.poll());
            }
            
        }else{
            for (int i = 0; i < q2Size; i++){
                a = queue2.poll();
                queue1.offer(queue2.poll());
            }

        }
        return a;
    }

    public boolean Empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

}
