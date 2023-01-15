package class_question;

import java.util.Arrays;

public class Merge_Sort {
    public static void merge(int[] arr, int si, int mid, int ei){
        int[] merge= new int[ei-si+1];
        int x1= si;
        int x2= mid+1;
        int x=0;
        while(x1<=mid && x2<=ei){
            if(arr[x1]<=arr[x2]){
                merge[x++]=arr[x1++];
            }
            else{
                merge[x++]=arr[x2++];
            }
        }
        while(x1<=mid){
            merge[x++]=arr[x1++];
        }
        while(x2<=ei){
            merge[x++]=arr[x2++];
        }
        for(int i=0, j=si; merge.length>i; i++,j++){
            arr[j]=merge[i];
        }
//        return arr;
    }
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei){
            return; //arr;
        }
        int mid= (si+ ei)/2;
        divide(arr, si, mid);
        divide(arr,mid+1,ei);
        merge(arr, si, mid, ei);
//        return arr;
    }
    public static void main(String[] args) {
        Merge_Sort m= new Merge_Sort();
 
        int[] arr= {4,6,2,1,3,7,8};
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
