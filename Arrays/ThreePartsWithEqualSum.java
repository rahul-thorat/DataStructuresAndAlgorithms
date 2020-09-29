package Arrays;

//check if we can divide an array into n parts with equal sum

import java.awt.*;

public class ThreePartsWithEqualSum {
    public static void main(String[] args) {
        int[] arr={1,3, 4,0,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        if(sum%3==0){
            int max=sum/3;
            int j=0;
            int i=0;
            int count=0;
            while(i<arr.length){
                int curr=0;
                for(j=i;j<arr.length;j++) {
                    curr = curr + arr[j];
                    if (curr == max) {
                        count++;
                        i=j;
                        //System.out.println(curr);
                        //System.out.println(i);
                        break;
                    }
                }
                if(curr==max)
                    i++;
                else
                    break;
            }
            if(count==3){
                System.out.println("yes");
            }
            else
                System.out.println("no");

        }
        else
            System.out.println(-1);

    }
}
