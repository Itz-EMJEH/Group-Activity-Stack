
# Stack Visualizer - Array-Based Bounded Stack

## Group Name
Group 2 (CN 48079)

## Group Members
* Abiso, Wing Hams J. 
* Aday, Allexies Kaye P.
* Barrida, Alea Rawan A.
* Dimo, Alschier 
* Dominguito, Mark Joel C.

## Description of the Program
The program is a Java Swing application designed to visually represent an array-based stack as a 2D drawing. Each stack element is displayed as a rectangular block where the newest element appears at the top, and the top block is clearly indicated. The GUI communicates exclusively through the stack component's methods to ensure the visualization accurately reflects the true state of the stack.

## Features
* **Push:** Accepts an integer input value and pushes it onto the stack.
* **Pop:** Removes only the top element from the stack.
* **Peek:** Highlights and displays the top element without removing or modifying it.
* **Clear:** Empties the entire stack.
* **Check Stack:** Reports whether the current stack is empty or displays its size.
* **Random:** Clears the stack and generates a random number of elements between 1 and the maximum capacity, with integer values between 1 and 100.
* **Status Messages:** Displays contextual notifications including `STACK UNDERFLOW`, `STACK OVERFLOW`, `STACK EMPTY`, and `INVALID INPUT`.

## Requirements
* Java Development Kit (JDK) 11 or later.
* No external libraries required, using only built-in `javax.swing`, `java.awt`, and `java.util`.

## How to Run the Program
1. Navigate to the folder containing your source files.
2. Compile the components:
   ```bash
   javac arraystack/ArrayStack.java arraystack/StackGUI.java arraystack/StackPanel.java
   
java arraystack.StackGUI

```text
arraystack/
├── ArrayStack.java    (stack data structure component)
├── StackGUI.java      (GUI component and event handling)
└── StackPanel.java    (2D graphical rendering component)
```
## Stack Implementation

The stack is implemented as a bounded, array-based data structure in `ArrayStack.java` using an integer array (`int[] data`) with a fixed capacity of 10 elements. The `top` variable tracks the index of the next free slot and represents the current size of the stack.

### Method Details

| Method | Description |
| :--- | :--- |
| `push(int value)` | Saves a value at `data[top]` and increments `top` by 1. Returns `false` if the stack is full (`isFull()`). |
| `pop()` | Decrements `top` by 1 and returns `data[top]`. Throws `IllegalStateException` on stack underflow if empty. |
| `peek()` | Returns `data[top - 1]` without modifying `top`. Throws `IllegalStateException` if empty. |
| `clear()` | Resets `top` to `0`, effectively clearing all elements. |
| `isEmpty()` | Returns `true` if `top == 0`. |
| `isFull()` | Returns `true` if `top == capacity`. |
| `size()` | Returns the current element count (`top`). |
| `getCapacity()` | Returns the maximum capacity (`capacity`). |
| `toArray()` | Returns a copy of the active stack elements from bottom to top so `StackPanel` can render them safely without modifying internal data. |

## UI Design 

<img width="1019" height="636" alt="Screenshot 2026-10-19 145828" src="https://github.com/user-attachments/assets/e5f668af-515f-4732-9d3a-6edc4e22a44a" />

## Program Structure

<img width="803" height="633" alt="Screenshot 2026-10-19 145918" src="https://github.com/user-attachments/assets/73f71b7f-81cd-49ac-a6f6-f1ee485433e2" />

### Sceenshots

## Push
<img width="642" height="627" alt="push 40" src="https://github.com/user-attachments/assets/5feed9b1-d4d6-47fe-bb5d-047473ad6ff2" />

## Pop
<img width="642" height="631" alt="pop 40" src="https://github.com/user-attachments/assets/c6765df7-ec09-4c38-b82e-bb22f7722f98" />

## Peek
<img width="637" height="628" alt="peek" src="https://github.com/user-attachments/assets/f1e09af7-1041-41df-bbd9-ee013ccb6468" />

## Random
<img width="643" height="631" alt="push random" src="https://github.com/user-attachments/assets/ed9d9cca-1a52-4f4e-95c2-0102ab930801" />

## Clear
<img width="640" height="622" alt="clear" src="https://github.com/user-attachments/assets/0839b25a-6842-4b31-8212-8830afb28562" />




