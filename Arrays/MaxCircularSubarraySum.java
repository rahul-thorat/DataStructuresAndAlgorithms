package Arrays;

public class MaxCircularSubarraySum {
    public static void main(String[] args) {
        int[] arr={8, -8, 9, -9, 10, -11, 12};
        int max_curr=arr[0];
        int min_curr= arr[0];
        int max_so_far=arr[0];
        int min_so_far= arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        for(int i=1;i<arr.length;i++){
            if(arr[i]+max_curr>=0){
                max_curr=arr[i]+max_curr;
            }
            else if(arr[i]+max_curr<0){
                max_curr=0;

            }
            if(max_curr>max_so_far) {
                max_so_far = max_curr;
            }

            if(arr[i]+min_curr<0){
                min_curr=arr[i]+min_curr;
            }

            else if(arr[i]+min_curr>=0){
                if(arr[i]>=0){
                    min_curr=0;
                }
                else
                    min_curr=arr[i];

            }
            if(min_so_far>min_curr){
                min_so_far=min_curr;
            }

        }

        if(min_so_far==sum){
            System.out.println(max_so_far);
        }
        else {
            System.out.println(max_so_far);
            System.out.println(min_so_far);
            System.out.println(Math.max(max_so_far, (sum - min_so_far)));
        }

    }
}
