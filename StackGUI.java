
package arraystack;

/* Description: StackGUI based on the original design but more simpler, now has push and pop functionality yet, but extends another class file.
Programmed by: <Mark Joel C. Dominguito, Allexies Kaye P. Aday> <BSIT> <48079> <DSA>
Last Modified: <10/18/26>
Version: <version 1.2>
[Acknowledgements: geeksforgeeks.org/java/introduction-to-java-swing/]
                   geeksforgeeks.org/java/java-awt-tutorial/ 
                   BroCode Java Lambda λ
*/

import javax.swing.*;
import java.awt.*;

public class StackGUI extends JFrame {
   
    private ArrayStack stack = new ArrayStack(10);
    private StackPanel stackPanel = new StackPanel();
    private JTextField inputField = new JTextField();
    private JLabel statusLabel = new JLabel("Ready");
    private JLabel sizeLabel = new JLabel();

    public static void main(String[] args) {
        StackGUI window = new StackGUI();
        window.setVisible(true);
    }

    public StackGUI() {
        super("Stack Visualizer");

        // buttons on the right
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(0, 1, 5, 5));
        controls.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        controls.add(new JLabel("Enter Value:"));
        controls.add(inputField);

        // make buttons
        JButton pushBtn = new JButton("PUSH");
        JButton popBtn = new JButton("POP");
        JButton peekBtn = new JButton("PEEK");
        JButton clearBtn = new JButton("CLEAR");
        JButton randomBtn = new JButton("RANDOM");

        // buttons will be clickable 
        pushBtn.addActionListener(e -> doPush());
        popBtn.addActionListener(e -> doPop());
        peekBtn.addActionListener(e -> doPeek());
        clearBtn.addActionListener(e -> doClear());
        randomBtn.addActionListener(e -> doRandom());

        // add buttons 
        controls.add(pushBtn);
        controls.add(popBtn);
        controls.add(peekBtn);
        controls.add(clearBtn);
        controls.add(randomBtn);
        controls.add(sizeLabel);
        controls.add(statusLabel);

        // put everything in the window
        add(stackPanel, BorderLayout.CENTER);
        add(controls, BorderLayout.EAST);

        updateView();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    // push
    private void doPush() {
        String text = inputField.getText().trim();
        if (text.isEmpty()) {
            statusLabel.setText("Enter a value first");
            return;
        }
        if (stack.isFull()) {
            statusLabel.setText("Stack Overflow: stack is full");
            return;
        }
        try {
            int value = Integer.parseInt(text);
            stack.push(value);
            statusLabel.setText("Pushed " + value);
            inputField.setText("");
            updateView();
        } catch (NumberFormatException ex) {
            statusLabel.setText("Invalid input: enter an integer");
        }
        inputField.requestFocus();
    }

    // pop
    private void doPop() {
        if (stack.isEmpty()) {
            statusLabel.setText("Stack Underflow: stack is empty");
            return;
        }
        int value = stack.pop();
        statusLabel.setText("Popped " + value);
        updateView();
    }

    // peek
    private void doPeek() {
        
    }

    // clear
    private void doClear() {
        
    }

    // random
    private void doRandom() {
        
    }

    // redraw the stack picture and update the size text
    private void updateView() {
        stackPanel.setData(stack.toArray(), stack.getCapacity(), false);
        sizeLabel.setText("Size: " + stack.size() + "/" + stack.getCapacity());
    }
}
