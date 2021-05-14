package HackwithInfy;

    



// Java program to find the number
// of permutations that satisfy
// the given condition in an array

import java.util.*;

     
    public class Question2 {
     
        public static void main(String[] args) {
            Question2 pa=new  Question2();
     
            int n= 2;
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=i+1;
     
            ArrayList<ArrayList<Integer>> permute = pa.permute(arr);
     
            long replace=0;
            for(ArrayList<Integer> perm:permute)
            {
                int[] ret = new int[perm.size()];
                for(int i = 0;i < ret.length;i++)
                    ret[i] = perm.get(i);
                
                    int b=ret[0]%2==0?0:1;
                    int c=ret[1]%2==0?0:1;
                    int d=ret[ret.length-1]%2==0?0:1; 
                    int e=ret[ret.length-2]%2==0?0:1;  
                    
                    if(b!=c || d!=e){
                        replace++;
                        continue;
                    }



                for(int i=1;i<ret.length-1;i++)
                {   int j=ret[i]%2==0?0:1;
                    int k=ret[i-1]%2==0?0:1;
                    int q=ret[i+1]%2==0?0:1;
                    if(j!=k && j!=q)
                        {   System.out.println(Arrays.toString(ret));
                           replace++;
                            break;
                        }
                    
                }
                
            }

            System.out.println((permute.size()-replace)%(int)(Math.pow(10,9)+7));
     
        }
        public ArrayList<ArrayList<Integer>> permute(int[] arr) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            permuteHelper(list, new ArrayList<>(), arr);
            return list;
        }
     
        private void permuteHelper(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> resultList, int [] arr){
     
            // Base case
            if(resultList.size() == arr.length){
                list.add(new ArrayList<>(resultList));
            } 
            else{
                for(int i = 0; i < arr.length; i++){ 
     
                    if(resultList.contains(arr[i])) 
                    {
                        // If element already exists in the list then skip
                        continue; 
                    }
                    // Choose element
                    resultList.add(arr[i]);
                    // Explore
                    permuteHelper(list, resultList, arr);
                    // Unchoose element
                    resultList.remove(resultList.size() - 1);
                }
            }
        } 
     
    }