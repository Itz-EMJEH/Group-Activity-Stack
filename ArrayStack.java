
package arraystack;

/* Description: 
Programmed by: <Alschier Dimo, Wing Hams Abiso> <BSIT> <48079> <DSA>
Last Modified: <10/18/26>
Version: <version 1.2>
[Acknowledgements: geeksforgeeks.org/dsa/stack-data-structure/
                   geeksforgeeks.org/dsa/implement-stack-using-array/
                   Claude sonnet 5.5 (Anthropic)
*/


public class ArrayStack {

    private int[] data;
    private int top;        // index of the next free slot and also the current size
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = 0;
    }

    // add a value on top; returns false if the stack is full
     public boolean push(int value) {
        if (isFull()) {
            return false;
        }
        data[top] = value;
        top++;
        return true;
    }

    // remove and return the top value (check isEmpty() first)
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack Underflow: stack is empty");
        }
        top--;
        return data[top];
    }

    // return the top value without removing it (check isEmpty() first)
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[top - 1];
    }

    public void clear() {
        top = 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        
    }

    public int size() {
       
    }

    public int getCapacity() {
        return capacity;
    }

    // copy of the current elements, bottom first, top last
    public int[] toArray() {
        int[] copy = new int[top];
        for (int i = 0; i < top; i++) {
            copy[i] = data[i];
        }
        return copy;
    }
}
