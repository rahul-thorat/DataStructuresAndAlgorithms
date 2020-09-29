package Arrays;

public class StockBuyAndSell {

    static void maxProfit(int[] arr){
        int n=arr.length;
        int min=arr[0];
        int res=0;
        for(int i=1;i<n;i++){
            if(arr[i]>min){
                res+=arr[i]-min;
                System.out.println(res);
                if(i<n-1) {
                    min = Math.min(arr[i], arr[i + 1]);
                }
                else{
                    min=arr[i];
                }
                System.out.println(min);
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        int arr[]={30,20,10};
        maxProfit(arr);
    }
}
