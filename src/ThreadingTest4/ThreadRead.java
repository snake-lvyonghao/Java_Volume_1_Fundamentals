package ThreadingTest4;

import java.io.PipedInputStream;

public class ThreadRead extends Thread{
    private ReadData readData;
    private PipedInputStream input;

    public ThreadRead(ReadData readData,PipedInputStream input)
    {
        this.input = input;
        this.readData = readData;
    }

    @Override
    public void run(){
        readData.readMethod(input);
    }
}
