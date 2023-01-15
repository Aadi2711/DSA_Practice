package class_question;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2Stack {
    int top1;
    int top2;
    Array_2Stack(int n){
        top1=-1;
        top2=n;
    }
    void push1(int[] arr, int x){
        if(this.top1==this.top2-1){
            System.out.println("Overflow");
        }
        else{
            this.top1++;
            arr[this.top1]=x;
        }
    }
    void push2(int[] arr, int x){
        if(this.top1==this.top2-1){
            System.out.println("Overflow");
        }
        else{
            this.top2--;
            arr[this.top2]=x;
        }
    }
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
        int[] arr= new int[10];
        Array_2Stack a= new Array_2Stack(arr.length);
        a.push1(arr, 5);
        a.push2(arr, 6);
        System.out.println(Arrays.toString(arr));
    }
}
