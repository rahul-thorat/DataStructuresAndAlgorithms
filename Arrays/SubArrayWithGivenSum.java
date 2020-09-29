package Arrays;

import java.awt.*;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={-10, 0, 2, -2, -20, 10};
        int k=1;
        int req=20;
        int l=0;
        int r=0;
        boolean flag=false;
        while(k<arr.length){
            int sum=0;
            for(int i=0;i<k;i++){
                sum+=arr[i];

            }
            for(int i=1;i<arr.length-(k-1);i++){
                sum=sum+arr[k-1+i]-arr[i-1];
                //System.out.println(sum);
                if(sum==req){
                    //System.out.println(i);
                    l=i;
                    r=l+k-1;
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                break;
            }
            k++;
        }
        if(flag==true) {
            System.out.println(l);
            System.out.println(r);
        }
        else
            System.out.println(-1);
    }
}
