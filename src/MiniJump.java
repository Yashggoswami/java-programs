import java.util.*;

public class MiniJump{
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        
        //size of the array 
        int n=sc.nextInt();

        // defining the array with n size
        int[] arr=new int[n];

        // taking the input in the array
        // 1 3 5 8 9 2 6 7 6 8 9
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

    }
}