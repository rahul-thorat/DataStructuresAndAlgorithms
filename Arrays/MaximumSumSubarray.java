package Arrays;

public class MaximumSumSubarray {

    static void maxSum(int[] arr){
        int n=arr.length;
        int max=arr[0];
        int curr_max=arr[0];
        for(int i=1;i<n;i++){
            if(curr_max+arr[i]>0 && curr_max+arr[i]>max ){
                max=curr_max+arr[i];
                curr_max=max;
            }

            else if(curr_max+arr[i]>0)
                curr_max=curr_max+arr[i];


            else if(curr_max+arr[i]<=0)
                curr_max=0;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        maxSum(arr);

    }
}
