
package arraystack;

/* Description: 
Programmed by: <Alschier Dimo> <BSIT> <48079> <DSA>
Last Modified: <10/18/26>
Version: <version 1>
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
       
    }

    // remove and return the top value (check isEmpty() first)
    public int pop() {
       
       
    }

    // return the top value without removing it (check isEmpty() first)
    public int peek() {
       
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
       
    }
}
