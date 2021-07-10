import java.io.*;
import java.util.*;
public class optimalfilemerge {
    public static void main(String arg[]) throws IOException
    {
        BufferedReader read=new BufferedReader(new FileReader("C:/Users/yashg/OneDrive/Desktop/java program/java/javaproject/src/Fast/input.txt"));
        int n=Integer.parseInt(read.readLine());
        String[] str=read.readLine().trim().split(" ");
        int[] arr=new int[n];
        int i=0;
        for(String st:str)
            arr[i++]=Integer.parseInt(st);
        // for(int j:arr)
        //     System.out.println(j);
        
        Queue<Integer> queue=new PriorityQueue<>();
        for(int j:arr)
        queue.add(j);
        int count=0;
        while(queue.size()>1)
        {
            int first=queue.remove();
            int second=queue.remove();
            int third=first+second;
            queue.add(third);
            count+=third;
        }
        System.out.println(count);
    }
}
