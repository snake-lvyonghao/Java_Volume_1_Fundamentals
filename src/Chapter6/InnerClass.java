package Chapter6;

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

        TalkingClock javvverer = new TalkingClock(1000,true);
        TalkingClock.TimerPrint lister = javvverer.new TimerPrint();
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
        //内部类
//        ActionListener listener = new TimerPrint();
//        Timer t = new Timer(interval,listener);
//        t.start();

        //匿名类
//        ActionListener listener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("At tone ,the time is :" + new Date());
//                if(beep) Toolkit.getDefaultToolkit().beep();
//            }
//        };
//        Timer timer = new Timer(interval,listener);

        //lambda
        Timer timer = new Timer(this.interval,e -> {
           System.out.println("At the tone is:" + new Date());
           if(this.beep) Toolkit.getDefaultToolkit().beep();
        });
        timer.start();
    }

    public class TimerPrint implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At tone ,the time is: " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}