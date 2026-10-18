package arraystack;

/* Description: StackPanel based on the original design but simpler, used to visually display the contents of a stack using Java Swing and custom painting. It draws empty slots and filled stack elements, with the top element highlighted when needed.
Programmed by: <Alschier Dimo> <BSIT> <48079> <DSA>
Last Modified: <10/18/26>
Version: <version 1>
[Acknowledgements: docs.oracle.com/javase/tutorial/uiswing/painting/index.html
                   docs.oracle.com/javase/8/docs/api/javax/swing/JPanel.html
                   math.hws.edu/javanotes-swing/c6/s2.html
                   cs.usfca.edu/~galles/visualization/java/visualization.html
                   geeksforgeeks.org/java/introduction-to-java-swing/
                   geeksforgeeks.org/java/java-awt-tutorial/]
*/

    
    
    import javax.swing.*;
    import java.awt.*;

public class StackPanel extends JPanel {
    private static final int BOX_W = 200;
    private static final int BOX_H = 30;
    private static final int BOX_X = 60;
    private static final int MARGIN = 5;

    private int[] elements = new int[0];
    private int capacity = 10;
    private boolean highlightTop = false;

    public void setData(int[] e, int cap, boolean hl) {
        elements = e;
        capacity = cap;
        highlightTop = hl;
        repaint();
    }

    public Dimension getPreferredSize() {
        return new Dimension(320, 40 + capacity * (BOX_H + MARGIN));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draw from the top slot (highest index) down to index 0
        for (int i = capacity - 1; i >= 0; i--) {
            int y = 20 + (capacity - 1 - i) * (BOX_H + MARGIN);
            boolean filled = i < elements.length;
            boolean isTop = i == elements.length - 1;

            
        }
    }
}
