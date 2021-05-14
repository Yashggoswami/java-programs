package HackwithInfy;
import java.util.*;

public class BeautifulString {

    public static int FindString(int n,int k, String str,int[] cost)
    {   int ans=0;
        while(!str.isEmpty()){
            
            int index=str.charAt(0)=='0'?str.indexOf('1'):str.indexOf('0');
            index=index==-1?str.length():index;

            System.out.println(str.substring(0, index));
            str=str.substring(index);

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        String str=sc.next();

        int[] cost=new int[n];
       
        for(int i=0;i<n;i++)
            cost[i]=sc.nextInt();
        System.out.println(FindString(n, k, str, cost));
    }
}
