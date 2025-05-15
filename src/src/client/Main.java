package client;

import javax.swing.*;

/**
 * Main class to create a JFrame and display the login panel.
 *
 * @author javiergs
 */
public class Main extends JFrame {

    public Main() {
        DrawArea drawArea = new DrawArea();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setSize(400, 400);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }

}