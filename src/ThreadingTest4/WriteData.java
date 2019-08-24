package ThreadingTest4;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {
    public void weiteMethod(PipedOutputStream out)
    {
        try {
            System.out.println("Write:");
            for (int i = 0; i < 300; i++) {
                String OutData = ""  + (i + 1);
                out.write(OutData.getBytes());
                System.out.println(OutData);
            }
            System.out.println();
            out.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
