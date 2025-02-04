package main;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(Panel panel) {
        this.add(panel);
        this.intiFrame();
    }

    public void intiFrame(){
        this.setTitle("gameFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }




}
