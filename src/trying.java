import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;
public class trying {
    public static void main(String[] args) {
        // int b=(int)Math.pow(10,64)+12;
        byte b=127;
        System.out.println(b);
        // double num[] = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
        // ArrayList<Integer> list=new ArrayList<>();
        // list.add(12);
        // list.add(123);
        // list.add(1232);
        // Iterator itr=list.iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        //     itr.remove();
        // }
        // Random rs=new Random();
        // int r=rs.nextInt(100);
        // System.out.println(r);
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        //     itr.remove();
        // }
        
        // PriorityQueue<Integer> queue=new PriorityQueue<>(new mycomparator());
        // queue.add(12323);
        // queue.add(2343);

        // while(!queue.isEmpty()){
        //     System.out.println(queue.poll());
        // }


    }

    public static class mycomparator<T extends Comparable<T>> implements Comparator<T>
    {
        @Override
        public int compare(T i,T j){
            return i.compareTo(j);
        }
    }
}
