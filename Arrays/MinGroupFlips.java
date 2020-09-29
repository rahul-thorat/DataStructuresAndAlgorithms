package Arrays;

public class MinGroupFlips {
    public static void main(String[] args) {
        int[] arr= {0,0,1};
        int first=arr[0];
        int n=arr.length;
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]) {
                count = i;
                break;
            }
        }
        System.out.println(count);

        int min_flips=0;
        for(int i=count;i<n;i++){
            if(arr[i]!=arr[i-1] && arr[i]==arr[count]){
                min_flips++;

                //i=i+1;
            }
            /*else if(arr[i]==arr[count] && i==n-1){
                min_flips++;
            }*/
        }
        System.out.println(min_flips);
    }
}
