package graph;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Traversal {
    boolean[] visited;
    int[] queue;
    int start;
    int end;
    int[] stack;
    int top;
    Traversal(int V){
        this.visited= new boolean[V];
        this.queue= new int[V];
        this.start=0;
        this.end=0;
        this.stack= new int[V];
        this.top=0;
    }

    public void BFS(int[][] Graph, int V, int source){
        this.queue[end]=source;
        int s= source;
        this.visited[s]=true;
        while(this.start<V){
            for(int i=0; i<V;i++){
                if(Graph[s][i]!=0 && !visited[i]){
                    end++;
                    this.queue[end]=i;
                    this.visited[i]=true;
                }
            }

            System.out.print(s+",");
            this.start++;
            if(V==start){
                break;
            }
            s=this.queue[this.start];
        }
    }


    public void DFS(int[][] Graph, int source, int V){
        this.visited[source]=true;
        this.stack[this.top++]=source;
        for (int i=0; i< Graph[source].length;i++){
            if(Graph[source][i]!=0 && !visited[i]){
                DFS(Graph,i,V);
            }
        }
    }
    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 0, 1, 2, 0, 0, 0 }, { 0, 0, 2, 0, 0, 3, 0 }, { 1, 2, 0, 1, 3, 0, 0 },
                { 2, 0, 1, 0, 0, 0, 1 }, { 0, 0, 3, 0, 0, 2, 0 }, { 0, 3, 0, 0, 2, 0, 1 }, { 0, 0, 0, 1, 0, 1, 0 } };
        Traversal graph1= new Traversal(7);
        Traversal graph2= new Traversal(7);
        graph1.BFS(graph,7,3);
        System.out.println(" ");
        graph2.DFS(graph, 4, 7);
        System.out.println(Arrays.toString(graph2.stack));
    }
}
