import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class stack<T> {
    public T[] elem;
    public int top;//kecunfangyuansude xiabiao

    public stack(){
        this.elem = (T[])new Objects[10];
    }

    public void push(T val) {
        //1
        if(full()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.top++] = val;
    }

    public boolean empty(){
        return this.top == 0;
    }

    public boolean full(){
        return this.top == this.elem.length;
    }

    public T pop(){
        if(empty()){
            throw new RuntimeException("kong");
        }
        T data = this.elem[this.top-1];
        this.top--;
        return data;
    }

    public T peek(){
        if(empty()){
            throw new RuntimeException("kong");
        }
        return this.elem[this.top-1];
    }

    public int size(){
        return top;
    }
}
