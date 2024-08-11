public class StaticStack<T> {
    private int top = -1;
    private T[] data;

    public StaticStack(int size) {
        this.data = (T[]) new Object[size];
    }

    public void push(T data) {
        if (top == this.data.length - 1) {
            throw new IllegalStateException("Stack is full");
        }
        top++;
        this.data[top] = data;
    }

    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = this.data[top];
        this.data[top] = null;
        top--;
        return value;
    }

    public void clear() {
        for (int i = 0; i <= top; i++) {
            this.data[i] = null;
        }
        top = -1;
    }

    public boolean isFull() {
        if (top == this.data.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        }
        return false;
    }
}