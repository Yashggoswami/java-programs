import java.util.*;

public class FindMinPath {
public static void main(String[] args) {
        int a[][] = {{4, 5, 3, 2},
                    {2, 10, 1, 4}};
        int t[][] = {{0, 7, 4, 5},
                    {0, 9, 2, 8}};
        int e[] = {10, 12}, x[] = {18, 7};

        int n=a[0].length;
        int[] temp1=new int[n];
        int[] temp2=new int[n];

        temp1[n-1]=x[0]+a[0][n-1];
        temp2[n-1]=x[1]+a[1][n-1];

        for(int i=n-2;i>=0;i--)
        {
            temp1[i]=Math.min(temp1[i+1]+a[0][i],temp1[i+1]+t[1][i+1]+a[0][i]);
            temp2[i]=Math.min(temp2[i+1]+a[1][i],temp2[i+1]+t[0][i+1]+a[1][i]);
        }

        System.out.println(Math.min(temp1[0]+e[0],temp2[0]+e[1]));

}
    
}
