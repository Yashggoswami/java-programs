import java.util.*;

public class Mcm {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    
      int[][] dp=new int[n-1][n-1];
    
      for(int gap=1;gap<n-1;gap++)
      {
        for(int i=0,j=gap;j<n-1;i++,j++)
        {
            if(gap==1)
                dp[i][j]=arr[i]*arr[j]*arr[j+1];
            else{
            dp[i][j]=Integer.MAX_VALUE;
            for(int q=i;q<j;q++)
            {
                dp[i][j]=Math.min(dp[i][j],dp[i][q]+dp[q+1][j]+(arr[i]*arr[q+1]*arr[j+1]));
            }
            }
        }
      
      }


      for(int[] i:dp)
      {
          for(int j=0;j<n-1;j++)
          {
              System.out.print(i[j]+" "); 
          }
          System.out.println();
      }
    }  
}

