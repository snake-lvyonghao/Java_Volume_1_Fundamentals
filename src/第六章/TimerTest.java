package 第六章;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {
    public static void main(String[] args){
        ActionListener listener = new TimePrinter();

        //construct a timer that calls the listener
        //once every 10 seconds
        Timer t = new Timer(5000,listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the tiome is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}

