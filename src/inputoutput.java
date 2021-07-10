import java.util.*;
import java.io.*;
import Fast.*;

public class inputoutput{
  
    public static void main(String[] args){
        FastReader sc = new FastReader();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++)
        {   StringBuilder st=new StringBuilder();
            for(int j=0;j<m;j++)
            {
                st.append(arr[i][j]+" ");
            }
            str.append(st.toString()+"\n");
        }

        System.out.println(str.toString());
        // int n = fast.nextInt();
        // int s = fast.nextInt();
        // String str = fast.nextLine();
        // double q = fast.nextDouble();

        // System.out.println(n + " " + s + " " + str + " " + q);
    }
}
