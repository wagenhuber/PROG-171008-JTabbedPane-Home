package com.sabel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Fenster extends JFrame{

    private JTabbedPane pane;

    public Fenster() {
        super("Karten");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pane = new JTabbedPane(JTabbedPane.TOP);
        JLabel image1 = new JLabel(new ImageIcon(getClass().getResource("person1.jpg")));
        JLabel image2 = new JLabel(new ImageIcon(getClass().getResource("person2.jpg")));
        pane.addTab("Tab1",image1);
        pane.addTab("Tab2",image2);
        //pane.addChangeListener(this);
        this.add(pane);
        this.setSize(500,500);
        setVisible(true);
    }


//    public void stateChanged(ChangeEvent event) {
//        System.out.println("karte" + pane.getSelectedIndex());
//    }

    public static void main(String[] args) {
        new Fenster();
    }


}
