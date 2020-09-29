package Arrays;

//Max value of a[j]-a[i] where j>i
public class MaximumDifference {

    static void maxDiff(int[] arr){
        int n=arr.length;
        int min=Math.min(arr[0],arr[1]);
        int res=arr[1]-arr[0];
        for(int i=2;i<n;i++){
            if(arr[i]-min>res){
                res=arr[i]-min;
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[]={10,20,30};
        maxDiff(arr);
    }
}
