package Arrays;

import java.util.Arrays;

public class TrappingRainWater {

    static void rainWater(int arr[]){
        int n=arr.length;
        int[] lMax=new int[n];
        int[] rMax=new int[n];
        int lmax=arr[0];
        int rmax=arr[n-1];
        for(int i=0;i<n;i++){
            lMax[i]=lmax;
            if(arr[i]>lmax){
                lmax=arr[i];
            }
        }
        System.out.println(Arrays.toString(lMax));
        for(int i=n-1;i>=0;i--){
            rMax[i]=rmax;
            if(arr[i]>rmax){
                rmax=arr[i];
            }
        }
        System.out.println(Arrays.toString(rMax));

        int res=0;
        for(int i=1;i<n-1;i++){
            int min=Math.min(rMax[i],lMax[i]);
            if(min>arr[i]){
                res+=min-arr[i];
            }
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        int[] arr={2, 0, 2};
        rainWater(arr);
    }
}
