import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
public class LIC {
    public static void main(String[] args) {
        int[] arr={10,22,9,33,21,50,41,60,80};
        int n=arr.length;
                // code here
               
                // int[] lookup=new int[arr.length];
                
                SortedMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
                
                // Arrays.fill(lookup,1);
                int max=1;
                
                for(int i=0;i<n;i++)
                {   
                    if(map.isEmpty())
                    {   map.put(arr[i],1);
                        continue;
                    }
                    
                    for(Map.Entry<Integer,Integer> pair:map.entrySet())
                    {   
                        if(arr[i]>pair.getKey())
                        {   
                            int num=1+pair.getValue();
                            
                            if(max<num)
                            max=num;
                            
                            map.put(arr[i],num);
                            break;
                        }
                    }
                   
                }
        
                // return max;
        // int[] lookup=new int[arr.length];

        // Arrays.fill(lookup,1);
        // int max=Integer.MIN_VALUE;
        // for(int i=1;i<n;i++)
        // {
        //     for(int j=i-1;j>=0;j--)
        //     {
        //         if(arr[i]>arr[j])
        //         {
        //             lookup[i]=Math.max(lookup[i],1+lookup[j]);
        //         }
        //     }
        //     max=Math.max(max,lookup[i]);
        // }

        System.out.println(max);


    }
    
}
