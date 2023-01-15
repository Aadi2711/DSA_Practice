package class_question;

import java.util.Arrays;
import java.util.Scanner;

public class PQ {
    int[][] arr;
    int n;
    int m;
    int[] rear;
    int[] top;

    void insertPQ(int ele, int pr){
        PQ ins= new PQ();
        if(pr>=this.n){
            System.out.println("Priority does not exist");
        }
        else if(this.top[pr-1]==(this.rear[pr-1]+1)%this.n){
            System.out.println("Overflow");
        }
        else if(this.top[pr-1]==-1){
            this.top[pr-1]++;
            this.rear[pr-1]++;
        }
        else{
            this.rear[pr-1]++;
        }
        this.arr[pr-1][this.rear[pr-1]]=ele;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of priorities you want: ");
        int n= sc.nextInt();
        System.out.print("Enter number of elements in a priority: ");
        int m= sc.nextInt();
        PQ first= new PQ();
        first.n=n;
        first.m=m;
        first.top= new int[n];
        first.rear= new int[n];
        first.arr= new int[first.n][first.m];
        for(int i=0;i<n;i++){
            first.top[i]=-1;
            first.rear[i]=-1;
        }
        while(0<1){
            System.out.println("Press 1 for Insert");
            System.out.println("Press 2 for Delete");
            System.out.println("Press 3 for print");
            System.out.println("Press 4 for exit");
            int a = sc.nextInt();
            if(a==1){
                System.out.print("Element to Insert: ");
                int x = sc.nextInt();
                System.out.print("Priority Of element: ");
                int pr = sc.nextInt();
                first.insertPQ(x, pr);
            }
            else if(a==2){

            }
            else if(a==3){
                for(int i=0; i<n;i++){
                    System.out.println(Arrays.toString(first.arr[i]));
                }
            }
            else{
                break;
            }
        }

    }

}
