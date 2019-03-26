package 第六章;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * 内部类
 * @version 2019-3-26
 * @author sanke_lvyonghao
 */
public class InnerClass {
    public static void main(String[] args){
        TalkingClock clock = new  TalkingClock(1000,true);
        clock.strat();

        JOptionPane.showMessageDialog(null,"Quit Program?");
        System.exit(0);
    }
}

class TalkingClock
{
    private int interval;
    private boolean beep;

    /**
     * 一个语音时钟结构体
     * @param interval the interval between messages
     * @param beep true if the clock should beep
     */
    public TalkingClock(int interval,boolean beep){
        this.beep = beep;
        this.interval = interval;
    }

    public void strat(){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval,listener);
        t.start();
    }

    public class TimerPrinter implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At tone ,the time is: " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}