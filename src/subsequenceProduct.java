import java.util.*;

public class subsequenceProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] dp=new int[k];

        for(int i=0;i<n;i++)
        {
            for(int j=k-1;j>=arr[i];j--)
            {
                if(j%arr[i]==0)
                {
                    int q=j/arr[i];
                    dp[j]+=(q==1?(1+dp[q]):dp[q]);
                }
            }
        }

        int sum=0;
        for(int x:dp)
            sum+=x;
        
        System.out.println("Possible subsequences are - "+sum);
    }    
}
