package Arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr= {0,10,8,2,0,0,13,0,4};

        int j=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
