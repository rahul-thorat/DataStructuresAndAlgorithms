package Arrays;

import java.util.Arrays;

public class RotateArray {

    static int[] reverse(int arr[],int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    static int[] rotateArray(int arr[],int no_of_rotations){
        reverse(arr,0,no_of_rotations-1);
        reverse(arr,no_of_rotations,arr.length-1);
        reverse(arr,0,arr.length-1);
        return arr;
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,9,12,20};
        System.out.println(Arrays.toString(arr));
        //reverse(arr,0,6);
        //System.out.println(Arrays.toString(arr));
        rotateArray(arr,5);
        System.out.println(Arrays.toString(arr));
    }
}
