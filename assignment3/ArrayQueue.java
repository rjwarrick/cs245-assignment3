package assignment3;

public class ArrayQueue<T> implements Queue<T> {
    T [] arr;
    int front;
    int back;
    int size;
    public ArrayQueue() {
        front = back = size = 0;
        arr = (T []) new Object[10];
    }
    @Override
    public T dequeue() throws Exception {
        if (empty())
            throw new Exception("Queue underflow");
        --size;
        return arr[front++ % arr.length];
    }
    private void grow_array() {
        T [] new_arr = (T[]) new Object[arr.length * 2];
        for (int i = front, j = 0; j < size; i++, j++) {
            new_arr[j] = arr[i % arr.length];
        }
        arr = new_arr;
        front = 0;
        back = size;
    }

    public void enqueue(T item) {
        if (size == arr.length)
            grow_array();
        arr[back++ % arr.length] = item;
        ++size;
    }
    @Override
    public boolean empty() {
        return size == 0;
        // return front == back;
    }
}
