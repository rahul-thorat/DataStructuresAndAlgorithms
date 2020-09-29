package Arrays;

public class MaxLenEvenOddSubArray {

    static void maxLen(int[] arr){
        int n=arr.length;
        boolean flag=true;
        if(arr[0]%2!=0)
            flag=false;
        int len=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(flag==false && arr[i]%2==0){
                len++;
                flag=true;
            } else if (flag == true && arr[i]%2!=0){
                len++;
                flag=false;
            }
            else{
                len=1;
                if(arr[i]%2!=0)
                    flag=false;
                else
                    flag=true;
            }
            if(len>max)
                max=len;

        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[]={10,12,8,4};
        maxLen(arr);
    }
}
