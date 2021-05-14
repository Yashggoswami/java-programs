import java.util.*;
public class RamuDishes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int q=sc.nextInt();
        
        for(int a=0;a<q;a++){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0;
        int count=0;

        int set=-1;
        int val=0;
        int dish=0;
        for(int i=0;i<n;i++)
        {   count=0;
            if(arr[i]>=1){
              val=arr[i];
                count=1;
                arr[i]=set;
            }
            else 
                continue;
            for(int j=i+1;j<n;j++){
                
                if(arr[j]==val && arr[j-1]!=set)
                {
                    count++;
                    arr[j]=set;
                }

            }
            
            if(count>max){
                max=count;
                dish=val;
            }
            set--;
        }

        System.out.println("Max picked dishes are - "+max);
        System.out.println("And the dish is "+dish);
    }

    }
}

// Given N= 9 and A= [1,2,2,1,2,1,1,1,1]

// 9
// 1 2 2 1 2 1 1 1 1

