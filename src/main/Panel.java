package main;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    Dimension dimension;
    public Panel() {
        dimension = new Dimension(800, 500);
        this.setLayout(null);
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.setPreferredSize(dimension);
        this.setBackground(Color.BLACK);

    }
}
