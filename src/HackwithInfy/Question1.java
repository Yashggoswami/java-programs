package HackwithInfy;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String str=sc.next();
        char[] st=str.toCharArray();
        int[] cost=new int[n];
       
        for(int i=0;i<n;i++)
        {
            cost[i]=sc.nextInt();
        }
        int[] arr=new int[n];
       
        Arrays.fill(arr,1);

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            arr[i]+=arr[i-1];
        }

        // PriorityQueue<Integer> pQueue
        // = new PriorityQueue<Integer>(
            // Collections.reverseOrder());
        int ans=0;
        for(int i=n-1;i>=0;)
        {
            if(arr[i]>k)
            {
                int operation=arr[i]-k;
                System.out.println("operation "+operation);
                PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

                for(int j=i;j>=0 && j>i-arr[i];j--)
                {
                    if(queue.isEmpty() || queue.size()<operation)
                    {
                        queue.add(cost[j]);
                        System.out.println(cost[j]);
                    }
                    else
                    {
                        int temp=queue.peek();
                        if(temp>cost[j])
                            queue.poll();
                        queue.add(cost[j]);
                    }
                }
                while(!queue.isEmpty())
                    ans+=queue.remove();
                i=i-arr[i];
            }else{
                i--;
            }


        }


        System.out.println(ans);



    }
}
