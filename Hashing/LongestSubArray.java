package Hashing;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//find the length of longest subarray with the given sum
public class LongestSubArray {

    public static int longestSubArray(int[] arr,int sum){
        int n=arr.length;
        int[] pre=new int[n];
        pre[0]= arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(pre));

        Map<Integer,Integer> m=new HashMap<>();
        int count=0;
        int maxCount=0;
        for(int i=0;i<n;i++){

            if(pre[i]==sum){
                count=i+1;
                if(count>maxCount)
                    maxCount=count;
            }
            if(!m.containsKey(pre[i]))
                m.put(pre[i],i);

           if(m.containsKey(pre[i]-sum)){
               count=i- m.get(pre[i]-sum);
                if(count>maxCount)
                    maxCount=count;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr={3,1,0,0,9,2,3,6};
        int sum=5;
        int x=longestSubArray(arr,sum);
        System.out.println(x);
    }
}
