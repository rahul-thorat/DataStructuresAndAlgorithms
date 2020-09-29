package Arrays;

public class MaxConsecutiveOnes {

    static void length(int[] arr){
        int n=arr.length;
        int curr=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                curr++;
                if(curr>max)
                    max=curr;
            }
            else
                curr=0;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr={0,0,0,0};
        length(arr);
    }
}
