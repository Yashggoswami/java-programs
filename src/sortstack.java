import java.util.*;
public class sortstack {

    public static void addelement(Stack<Integer> s,int st)
    {
        if(s.isEmpty()){
            s.push(st);
        }
        else
            {
                if(s.peek()<st){
                    s.push(st);
                }
                else
                    {
                        int x=s.pop();
                        addelement(s,st);
                        s.push(x);
                    }
            }
    }
    public static void sortstack(Stack<Integer> s)
    {
        if(s.isEmpty())
            return;
        
        int st=s.pop();
        sortstack(s);
        
        addelement(s,st);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Stack<Integer> stack = new Stack<>();

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }

        System.out.println(stack);
        
        sortstack(stack);

        
        System.out.println(stack);
    }
}
