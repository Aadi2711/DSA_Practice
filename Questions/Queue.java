import java.util.Scanner;

public class Queue {
    static int front = -1;
    static int rear = -1;
    static void Insert(int arr[] ,int front ,int rear, int n , int x){
        if(rear == n-1){
            System.out.println("Overflow");
        }
        else if(rear == -1){
            front =0 ;
            rear = 0;
        }
        else{
            rear = rear+1;
        }
        arr[rear] = x;
        System.out.println(rear);
    }
    static void Deletion(int arr[] ,int front ,int rear){
        if(front == -1){
            System.out.println("Underflow");
        }
        
        else if(rear == front){
            front = -1 ;
            rear = -1;
        }
        else{
            front = front +1;
        }
        
    }
    static void print(int arr[],int front,int rear){
        for(int i = front ; i<=rear ;i++ ){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr [] = new int[n];
        while(n>0){
            System.out.println("Press 1 for Insertion");
            System.out.println("Press 2 for Deletion ");
            System.out.println("Press 3 for Print");
            System.out.println("Press 4 for Exit");
            int i = sc.nextInt();
            if(i == 1){
                System.out.print("Enter element to insert: ");
                int x = sc.nextInt();
                Insert(arr, front, rear, n, x);
            }
            else if(i ==2)
                Deletion(arr, front, rear);        
            else if(i==3)
                print(arr, front, rear);
            else if(i==4)
                break;
        }
        
        sc.close();
    }
}
