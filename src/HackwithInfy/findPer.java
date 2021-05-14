package HackwithInfy;

import java.util.Arrays;
import java.util.Scanner;

public class findPer {
    public static int find(int[] p,int[] x,int[] y){
        int max=Integer.MIN_VALUE;
        int m=x.length;
        int n=p.length;

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=p[i];

        Arrays.sort(arr);
        for(int i=0;i<m;i++)
        {
            int[] temp=p;
            int swap=temp[x[i]-1];
            temp[x[i]-1]=temp[y[i]-1];
            temp[y[i]-1]=swap;
            System.out.println(Arrays.toString(temp));
            int count=1;
  
            for(int j=0;j<n;j++)
            {
                if(arr[j]==temp[j])
                  count++;
            }
           
            max=Math.max(count,max);

        }

        return max;
    }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int[] p=new int[n];
      int m = sc.nextInt();

      for(int i=0;i<n;i++)
        p[i]=sc.nextInt();

      int[] x=new int[m];

      
      for(int i=0;i<m;i++)
        x[i]=sc.nextInt();
        
      int[] y=new int[m];

      for(int i=0;i<m;i++)
      y[i]=sc.nextInt();

      int result=find(p,x,y);
      System.out.println(result);
      

       


  }  
}

// 5
// 2
// 5
// 3
// 1
// 4
// 2
// 1
// 5
// 3
// 4