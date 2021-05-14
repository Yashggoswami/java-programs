package HackwithInfy;

import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class commonRangeSoldiers {

        //pair of upper and lower bound
        static class pair{
            int low;
            int high;
            pair(int l,int h){
                low=l;
                high=h;
            }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] lvalue=new int[n];
        int[] hvalue=new int[n];

        for(int i=0;i<n;i++)
            lvalue[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
            hvalue[i]=sc.nextInt();
        
            //list of pairs
        ArrayList<pair> list=new ArrayList<>();

        //adding al pairs
        for(int i=0;i<n;i++)
            list.add(new pair(lvalue[i],hvalue[i]));

        //sorting list on the basis of lower bound using comparator class
        list.sort(new Comparator<pair>(){
            public int compare(pair o1,pair o2)
            {
                return o1.low-o2.low;
            }
        });
        //max will store the ans 
        int max=0;

        //first loop to skip one soldier at a time
        for(int i=0;i<list.size();i++)
        {   
            //pair variable temp to store the preprocessed data
            pair temp=null;
            System.out.println("after removing"+"["+list.get(i).low+","+list.get(i).high+"]");
            //second loop to find the interection of remaining soldiers
            for(int j=0;j<list.size();j++)
            {       
                    if(i==j)
                        continue;
                    if(temp==null)
                        temp=list.get(j);
                    else
                        {   
                           
                            if(temp.high<list.get(j).low)
                                {
                                    temp=null;
                                    break;
                                }
                              // ex - [1,4] interaction [2,3] = [2,3]
                            else if(temp.high>=list.get(j).high)
                                temp=list.get(j);
                            //ex - [1,4] interaction [3,5] = [3,4]
                            else if(temp.high>=list.get(j).low)
                                temp=new pair(list.get(j).low,temp.high);

                            System.out.println("preprocessed"+"["+temp.low+","+temp.high+"]");
                            
                        }
            }
            //storing maximum common range by subtracting high and low values and adding 1 to include the upper limit
            // [3,5] -> 5-3=2 -> 2+1=3
            
            if(temp!=null){
                System.out.println("["+temp.low+","+temp.high+"]");
                max=Math.max(max,temp.high-temp.low+1);
            }
        }
        //print ans
        System.out.println(max);
    }
}

// sample input
// 4
// 1
// 2
// 3
// 4
// 4
// 4
// 4
// 4