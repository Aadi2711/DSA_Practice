package heap;

import java.util.Arrays;

public class Heap {
    int[] arr;
    int size;
    int len;
    Heap(int n){
        arr= new int[n];
        size =0;
        len=n;
    }
    static void maxheapify(int arr[], int size, int index){
        int largest=index;
        //One based indexing
        int l= 2*index;
        int r= 2*index+1;
        if(l<size && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<size && arr[r]>arr[largest]){
            largest=r;
        }

        if(largest!=index){
            int temp= arr[index];
            arr[index]=arr[largest];
            arr[largest]=temp;
            maxheapify(arr,size,largest);
        }
    }

    static void minheapify(int arr[], int size, int index){
        int minimum=index;

        int l= 2*index;
        int r= 2*index+1;

        if(l<=size && arr[l]<arr[minimum]){
            minimum=l;
        }
        if(r<=size && arr[r]<arr[minimum]){
            minimum=r;
        }

        if(minimum!=index){
            int temp=arr[index];
            arr[index]= arr[minimum];
            arr[minimum]=temp;
            index=minimum;
            minheapify(arr,size,index);
        }
    }
    void maxinsert(int value){
        this.size++;
        int index=this.size;
        this.arr[index]=value;
        while (index>1){
            int parent=index/2;
            if(this.arr[parent]<this.arr[index]){
                int temp= this.arr[parent];
                this.arr[parent]=this.arr[index];
                this.arr[index]=temp;
                index=parent;
            }
            else{
                return;
            }
        }
    }

    void mininsert(int value){
        this.size++;
        int index= this.size;
        this.arr[index]=value;
        while (index>1){
            int parent=index/2;
            if(this.arr[parent]>this.arr[index]){
                int temp= this.arr[parent];
                this.arr[parent]=this.arr[index];
                this.arr[index]=temp;
                index=parent;
            }
            else{
                return;
            }
        }
    }

    public void deletemin(){
        if(this.size==0){
            System.out.println("Heap is empty");
            return;
        }
        this.arr[1]=this.arr[size];
        size--;
        minheapify(arr,size,1);
    }

    public void deletemax(){
        if(this.size==0){
            System.out.println("Heap is empty");
            return;
        }
        this.arr[1]=this.arr[size];
        this.size--;
        Heap.maxheapify(this.arr,this.size,1);
    }
    void print(){
        for(int i=1; i<=size; i++){
            System.out.print(this.arr[i]+"->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Heap heap1= new Heap(20);
        Heap heap2= new Heap(20);
        heap1.maxinsert(38);
        heap1.maxinsert(45);
        heap1.maxinsert(29);
        heap1.maxinsert(10);
        heap1.maxinsert(50);
        heap1.print();
        heap1.deletemax();
        heap1.print();

        heap2.mininsert(40);
        heap2.mininsert(10);
        heap2.mininsert(30);
        heap2.mininsert(39);
        heap2.mininsert(60);
        heap2.mininsert(12);
        heap2.print();
        heap2.deletemin();
        heap2.print();

        int[] arr={34,21,41,45,24,56,35,34};
        for(int i= arr.length;i>=0;i--){
            Heap.maxheapify(arr,arr.length,i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
