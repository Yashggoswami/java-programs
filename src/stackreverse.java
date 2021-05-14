import java.util.*;

public class stackreverse {
    public static void insert_at_bottom(Stack<Integer> stack,int x)
    {
        if(stack.isEmpty())
            stack.push(x);
        else{
            int s=stack.pop();
            insert_at_bottom(stack, x);
            stack.push(s);
        }
    }
    public static void reverse(Stack<Integer> stack)
    {
        if(stack.isEmpty())
            return;
        
        int s=stack.pop();
        reverse(stack);
        insert_at_bottom(stack,s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            Stack<Integer> stack = new Stack<>();

            int n=sc.nextInt();

            for(int i=0;i<n;i++){
                stack.push(sc.nextInt());
            }

            System.out.println(stack);
            
            reverse(stack);

            
            System.out.println(stack);
            

    }
}
