package Sorts;

//Insertion sort is efficient than Selection Sort
//We are inserting the element in right position
//we are also shifting the element insted of swipping
//space complexity 0(1) in place sorting.
//Time complexity in best case sinario(Alredy sorted) 0(n)
//Time complexity in Worst case sinario having Time complexity 0(n2) - shifting and comparing of elements is required.

public class InsertionSort {
    static void main(String[] args) {
        int arr[] = {5,9,1,6,3,2};
        int size = arr.length;

        for(int i=1;i<size;i++){

            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){

                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;

        }

        System.out.println();
        System.out.println("After sorting ");
       for (int n:arr){
           System.out.print(n+" ");
       }

    }

}
