package sample;

import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel DragPanel = new DragPanel();
    MyFrame(){
        this.add(DragPanel);
        this.setTitle("Drag & Drop");
        this.setSize(900,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
