package class_question;

import java.util.Arrays;

public class Sparse {
    public static int[][] new1(int[][] arr, int n){
        int[][] arr1= new int[3][n];
        int s=0;
        for(int i=0; arr.length>i;i++){
            for(int j=0; arr[i].length>j;j++){
                if(arr[i][j]!=0){
                    arr1[0][s]=i;
                    arr1[1][s]=j;
                    arr1[2][s]=arr[i][j];
                    s++;
                }
            }

        }
        return arr1;
    }
    public static void main(String[] args) {
        int[][] arr= {{0,5,0,6,0,0,0},{0,0,2,1,0,0,4},{0,0,0,0,2,4,0}};
        int n=0;
        for(int i=0; arr.length>i;i++){
            for(int j=0; arr[i].length>j;j++){
                if(arr[i][j]!=0){
                    n++;
                }
            }
        }
        int[][] arr1= new1(arr,n);

        for(int i=0; i<arr1.length; i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
}
