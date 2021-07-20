package practice;

public class recursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        recur(arr,0,arr.length);
    }

    public static void recur(int[] arr,int l ,int h)
    {   
        if(l==h)
            return;
        
        if(l%2!=0)
            System.out.println(arr[l]);
            
        recur(arr,l+1,h);
        
        if(l%2==0)
            System.out.println(arr[l]);
    }
}
