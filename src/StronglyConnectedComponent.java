import java.util.*;

public class StronglyConnectedComponent {
    public static void dfs_connect(int node,ArrayList<ArrayList<Integer>> graphreverse,boolean[] visited,String str){
        if(visited[node]){
            System.out.println(str);
            return;
        }
        visited[node]=true;

        for(int x:graphreverse.get(node))
        {
            dfs_connect(x, graphreverse, visited,str+" "+x);
        }
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph,int node,boolean[] visited,ArrayDeque<Integer> stack)
    {
        if(visited[node])
            return;
        visited[node]=true;

        for(Integer x:graph.get(node))
        {   
            if(!visited[x]){
                dfs(graph,x,visited,stack);
                
            }
        }

        stack.offerLast(node);

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        ArrayList<ArrayList<Integer>> graphreverse=new ArrayList<>();
        int v=8;
        for(int i=0;i<=v;i++)
        {
            graph.add(new ArrayList<Integer>());
            graphreverse.add(new ArrayList<Integer>());
        }

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);
        graph.get(2).add(4);
        graph.get(3).add(0);
        graph.get(4).add(5);
        graph.get(5).add(6);
        graph.get(6).add(4);
        graph.get(6).add(7);
        graph.get(7).add(8);

        for(int i=0;i<=v;i++)
        {
            for(int x:graph.get(i))
            {
                graphreverse.get(x).add(i);
            }
        }

        boolean[] visited=new boolean[v+1];

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for(int i=0;i<=v;i++)
        {
            if(!visited[i])
                dfs(graph,i,visited,stack);
        }

        Arrays.fill(visited,false);


        for(int x:stack)
        {
            System.out.print(x+" ");
        }
        int count=0;
        

        while(!stack.isEmpty())
        {
            int node=stack.pollLast();
            if(!visited[node])
            {
                dfs_connect(node,graphreverse,visited," ");
                
                count++;
            }
        }

        System.out.println("Total Count : "+count);


    }
}
