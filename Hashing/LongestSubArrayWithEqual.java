package Hashing;

import java.util.HashMap;
import java.util.Map;

//FInd the length of the longest subarray with equal no of zeroes and ones
public class LongestSubArrayWithEqual {

    public static int longest(int[] arr){
        int res=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                arr[i]=-1;
        }

        int[] pre=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }

        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(pre[i]==0)
                res=Math.max(res,i+1);
            if(!m.containsKey(pre[i]))
                m.put(pre[i],i);
            if(m.containsKey(pre[i]))
                res=Math.max(res,i-m.get(pre[i]));
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,1,1,0};
        int x=longest(arr);
        System.out.println(x);
    }
}
