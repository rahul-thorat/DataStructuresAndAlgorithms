package Arrays;

import java.util.Arrays;

public class Leaders {

    static void leader(int[] arr){
        int n=arr.length;
        int max=-1;
        for(int i=n-1;i>=0;i--){
            if(max<=arr[i]){
                System.out.println(arr[i]);
                max=arr[i];
            }

        }

    }
    public static void main(String[] args) {
        int[] arr= {7, 4 ,5 ,7 ,3};
        leader(arr);

    }
}
