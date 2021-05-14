package HackwithInfy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindPermutation {
    // public void nextPermutation(int[] nums) {
    //     // find k, such that nums[k] < nums[k+1]
    //     int k = nums.length - 2;
    //     for(; k >= 0; k--) {
    //         if(nums[k] < nums[k+1]) break;
    //     }
        
    //     if(k < 0) {
    //         // sort in ascending order
    //         reverse(nums, 0, nums.length-1);
    //     } else {
    //         // find l, such that nums[l] > nums[k]
    //         int l = nums.length - 1;
    //         for(; l >= 0; l--) {
    //             if(nums[l] > nums[k]) {
    //                 break;
    //             }
    //         }

    //         // swap nums[k] and nums[l]
    //         swap(nums, k, l);

    //         // reverse sequence nums[k+1] to nums[nums.length-1]
    //         reverse(nums, k+1, nums.length-1);
    //     }
    // }
    
    // private void swap(int[] nums, int i, int j) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }
    
    // private void reverse(int[] nums, int start, int end) {
    //     while(start < end) {
    //         swap(nums, start, end);
    //         start++;
    //         end--;
    //     }
    // } 

    public static int minihappiness(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            list.add(i+1);
            list1.add(arr[i]);
        }

        int result=0;

        for(int i=0;i<arr.length;i++)
        {
            list1.remove(Integer.valueOf(arr[i]));
            list.remove(Integer.valueOf(arr[i]));
        }

        System.out.println(list.size()+" "+list1.size());
        for(int i=0;i<list.size();i++)
        {
            result+=Math.abs(list1.get(i)-list.get(i));
        }

        return result;

        

    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int result=minihappiness(arr);

        System.out.println(result);
    }
}
