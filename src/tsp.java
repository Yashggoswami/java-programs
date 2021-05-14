import java.util.*;
public class tsp{
    public static void main(String[] args)
    {
        int[][] Edges={{0,1},{0,3},{1,2},{3,2},{3,4},{2,5},{4,5},{4,6},{5,6}};
        int N=7;
        int M=Edges.length;
       tsp obj=new tsp();
       System.out.println(obj.check(N, M, Edges));
        
        
    }

    public boolean cycle( HashMap<Integer,ArrayList<Integer>> map,int node,boolean[] visited,String str)
    {   
        if(str.length()==visited.length){
            System.out.println(str);
            return true;}


        visited[node]=true;


        for(int x:map.get(node))
        {   
            if(!visited[x])
            {   if(cycle(map,x,visited,str+(x)))
                    return true;
            }
         }
        
        visited[node]=false;

        return false;
       
    }
    public boolean check(int N, int M, int[][] Edges) 
    { 
        // code here
        boolean[] visited=new boolean[N];
        
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        
        for(int i=0;i<N;i++)
            map.put(i,new ArrayList<Integer>());
        
        for(int[] edge:Edges)
        {
            int u=edge[0];
            int v=edge[1];
            
            map.get(u).add(v);
            map.get(v).add(u);
        }
        
        for(int i=0;i<N;i++)
        {
           if(cycle(map,i,visited,""+i))
            return true;
     

            
        }
        
        return false;
    }
}