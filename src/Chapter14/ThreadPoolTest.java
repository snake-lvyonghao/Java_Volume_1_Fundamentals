package Chapter14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args)
    {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter base directory");
            String dirctory = in.nextLine();
            System.out.print("Enter keywoed");
            String keyword = in.nextLine();

            ExecutorService pool = Executors.newCachedThreadPool();

            MatchCounter2 counter = new MatchCounter2(new File(dirctory),keyword,pool);
            Future<Integer> result = pool.submit(counter);

            try{
                System.out.print(result.get() + "matching files.");
            }catch (ExecutionException e)
            {
                e.printStackTrace();
            }
            catch (InterruptedException e)
            {
            }
            pool.shutdown();

            int largestPoolSize = ((ThreadPoolExecutor) pool).getLargestPoolSize();
            System.out.print("Largest poolsize=" + largestPoolSize);
        }
    }
}

class MatchCounter2 implements Callable<Integer>{
    private File directory;
    private String keyword;
    private ExecutorService pool;
    private int count;

    public MatchCounter2(File dirctory,String keyword,ExecutorService pool){
        this.directory = dirctory;
        this.keyword = keyword;
        this.pool = pool;
    }

    @Override
    public Integer call(){
        count = 0;
        try{
            File[] files = directory.listFiles();
            List<Future<Integer>> results= new ArrayList<>();

            for (File file :
                    files) {
                if(file.isDirectory())
                {
                    MatchCounter2 counter = new MatchCounter2(file,keyword,pool);
                    Future<Integer> reslut = pool.submit(counter);
                    results.add(reslut);
                }else {
                    if(search(file)) count++;
                }
            }

            for (Future<Integer> result :
                    results) {
                try{
                    count += result.get();
                }
                catch (ExecutionException e)
                {
                    e.printStackTrace();
                }
            }
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return count;
    }

    public boolean search(File file)
    {
        try{
            try (Scanner in = new Scanner(file,"UTF-8")){
                {
                    boolean found = false;
                    while(!found && in.hasNextLine())
                    {
                        String line = in.nextLine();
                        if(line.contains(keyword)) found = true;
                    }
                    return found;
                }

            }
        }catch (IOException e)
        {
            return false;
        }
    }
}
