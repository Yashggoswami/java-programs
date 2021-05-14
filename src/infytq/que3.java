package infytq;
import java.util.*;
public class que3 {
    private static Object pop;

    public static void main(String[] args) {
        Stack<Integer> instack=new Stack<>();

        for(int i=5;i<10;i++)
            instack.push(i);

        Queue<String> inqueue=new LinkedList<>();
        inqueue.add("First");
        inqueue.add("Second");
        inqueue.add("Third");
        inqueue.add("Fourth");
        inqueue.add("Fifth");
        inqueue.add("Finish");

        ArrayDeque<Integer> queue=convertStructure(instack, inqueue);
        while(!queue.isEmpty())
        {
            System.out.println(queue.remove());
        }

       
    }

    public static ArrayDeque<Integer> convertStructure(Stack<Integer> instack,Queue<String> inqueue){
        ArrayDeque<Integer> output=new ArrayDeque<>();
      
        do{
            pop = instack.pop();
            output.push((Integer)pop);
        }
        while(!instack.isEmpty() && instack.pop()!=Integer.MIN_VALUE);
      
        System.out.println(output.toString());

        while (!inqueue.isEmpty()) {
            String str=(String)inqueue.poll();
            if(output.peek()!=str.length()){
                output.offer(((String)inqueue.poll()).length());
            }

        }

        
        if(output.peek()==output.poll())
        {
            output.remove();
        }

        output.pop();

        return output;
    }
    
}
