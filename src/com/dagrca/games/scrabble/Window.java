package com.dagrca.games.scrabble;

import javax.swing.*;
import java.awt.*;

/**
 * User: carrelld
 * Date: 3/22/2016
 * Time: 3:57 PM
 * Purpose:
 */
public class Window {

    public static void Window() {

    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("TITLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(1750, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
