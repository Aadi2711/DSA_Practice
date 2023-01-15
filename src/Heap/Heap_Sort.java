package heap;

import java.util.Arrays;

public class Heap_Sort {
    public void maxheapify(int[] arr, int size, int index){
        int largest=index;
        //Zero based indexing
        int l= 2*index+1;
        int r= 2*index+2;
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

    public void algo(int[] heap, int size){
        int length=size-1;
        for (int len=size-1;len>0;len--){
            int temp= heap[0];
            heap[0]= heap[len];
            heap[len]=temp;
            maxheapify(heap, len,0);
        }
    }

    public static void main(String[] args) {
        Heap_Sort heap= new Heap_Sort();
        int[] arr= new int[6];
        arr[0]=0;
        int[] heaparr= {70,66,55,45,50};
        for (int i=1; i<arr.length; i++){
            arr[i]=heaparr[i-1];
        }
        heap.algo(heaparr,heaparr.length);

        System.out.println(Arrays.toString(heaparr));


    }
}
