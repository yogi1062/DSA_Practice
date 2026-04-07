package Sorts;

public class BubbleSort {
   public static void main(String[] args) {
        int []arr = {6,1,3,9,2,5,7};
        int temp = 0;

       System.out.println("Before sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
       System.out.println();

        for(int i=0;i<arr.length;i++){

            for (int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    for(int t:arr){
                        System.out.print(t+" ");
                    }
                    System.out.println();
                }
            }
        }
       System.out.println();
       System.out.println("After sorting");
       for(int i:arr){
           System.out.print(i+" ");
       }

    }
}
