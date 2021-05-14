import java.util.*;

public class BhideGift
{

    public static void printArr(int[] arr, int n) 
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]);
    }

    public static int compare(int num1, int num2)
    {
  
        String A = Integer.toString(num1);
  
        String B = Integer.toString(num2);
          

        return (A+B).compareTo(B+A);
    }
  

    public static void printSmallest(int N, int[] arr) 
    {
  
        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < N; j++)
            {
                if (compare(arr[i], arr[j]) > 0)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
  
 
        printArr(arr, N);
    }
  
    public static void main(String[] args) 
    {
        // int[] arr = { 5, 6, 2, 9, 21, 1 };
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
      
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printSmallest(n, arr);
    }
}
