import java.util.*;
public class AbdulRecharge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] recharges=new int[n];

        for(int i=0;i<n;i++)
        {
            recharges[i]=sc.nextInt();
        }
        Arrays.sort(recharges);
        int operation=0;
        int ans=0;

        for(int i=0;i<n;i++)
        {
            if(i==0 || ans==0)
                ans=recharges[i];
            else{
                ans=1*ans+2*recharges[i];
                operation++;
            }

            if(ans>=k)
                ans=0;

        }

        System.out.println("Operations needed are - "+operation);
    }
}
