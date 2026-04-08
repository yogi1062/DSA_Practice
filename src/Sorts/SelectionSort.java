package Sorts;

//selection sort time complexity - 0(n2)
//we are finding the min no and shifting to the front of the numsay
//we are swiping the elements in outer loop which will reduce the swiping steps.

public class SelectionSort {
    public static void main(String[] args) {

        int []nums = {6,1,3,9,2,5,7};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;


        System.out.println("Before sorting");
        for(int i:nums){
            System.out.print(i+" ");
        }

        for(int i=0;i<size-1;i++){
             minIndex = i;

            for(int j=i+1;j<size;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i] = temp;
            System.out.println();
            for(int k:nums){
                System.out.print(k+" ");
            }
        }

        System.out.println();
        System.out.println("After sorting");
        for(int i:nums){
            System.out.print(i+" ");
        }

    }
}
