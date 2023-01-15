package graph;

import java.util.Arrays;

public class Warshalls {
    public void algo(int[][] arr, int V){
        for (int k=0; k<V;k++){
            for (int i=0;i<V;i++){
                for (int j=0; j<V; j++){
                    if(i==j || i==k || j==k){
                        continue;
                    }
                    if(arr[i][j] > arr[i][k]+arr[k][j]){
                        arr[i][j]=arr[i][k]+arr[k][j];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Warshalls war= new Warshalls();
        int graph[][] = new int[][] { { 0, 4, 1, 2, 0, 892, 0 }, { 2, 0, 2, 892, 4, 3, 18}, { 1, 2, 0, 1, 3, 7, 3 },
                { 2, 3, 1, 0, 892, 892, 1 }, { 892, 892, 3, 7, 0, 2, 4 }, { 10, 3, 19, 892, 2, 0, 1 }, { 5, 892, 3, 1, 892, 1, 0 } };
        for(int i=0; i<graph.length;i++){
            System.out.println(Arrays.toString(graph[i]));
        }
        war.algo(graph, graph.length);

        for(int i=0; i<graph.length;i++){
            System.out.println(Arrays.toString(graph[i]));
        }
    }
}
