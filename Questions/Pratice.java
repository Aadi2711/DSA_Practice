import java.util.Arrays;

public class Pratice {
    //Linear Array
    //Reverse a array
    static void reverse(int arr[] , int n ){
        for(int i =0 ;i<n/2 ;i++){
            arr[i] = arr[i] +arr[n-1-i];
            arr[n-1-i] = arr[i] -arr[n-1-i];
            arr[i] = arr[i] -arr[n-1-i];
        }
    }

    // Insertion in array
    static void insert(int arr[] , int n ){
        for(int i  = 0 ; i < n ; i++){
            arr[i] = 0;
        }
    }

    //Deletion
    static void delete(int arr[] , int n , int x){
        for(int i = x ; i < n ; i++){
            arr[i-1] = arr[i] +arr[i-1];
            arr[i] = arr[i-1] -arr[i];
            arr[i-1] = arr[i-1] -arr[i];
        }
        
        n = n-1;
        for ( int i = 0 ; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
    }
    //sorting.Sorting
    //Bubble Sort
    static void bubbleSort(int arr[] , int n ){
        for(int i = 0 ; i < n ;i++){
            for(int j = 1 ; j < n ;j++){
                if(arr[j-1] > arr[j]){
                    int temp =arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] =  temp;
                }
            }
        }
    }
    // Selection Sort

    static void Selection(int arr[] , int n){
        for(int i =0 ; i< n ;i++){
            int min = arr[i];
            int pos = i;
            for(int j = i+1 ;j< n ; j++){
                if(min>arr[j]){
                    min = arr[j];
                    pos = j;
                }
                
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }

    // Inseration Sort
    static void Inseration(int arr[] ,int n ){
        for(int i = 0 ; i<n ;i++){
            int key = arr[i];
            int j = i-1;
            while(j >=0 && key < arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i--;
            }
        }
    }
    // Searching
    //Linear Search
    static int Lsearch(int arr[] , int n , int x){
        for(int i = 0 ; i < n ;i++){
            if(arr[i]  == x){
                return i+1;
            }
        }
        return -1;
    }
    //Binary Search
    static int Bsearch(int arr[] , int n , int x){
        int low =0 ;
        int high = n-1;
        while(high>=low){
            int mid = (high+low)/2;
            // System.out.println(mid);
            if(arr[mid] == x){
                return mid+1;
            }
            else if(arr[mid] > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6};
        int n = 5;
        System.out.println(Bsearch(arr, n , 3));
    }
}
