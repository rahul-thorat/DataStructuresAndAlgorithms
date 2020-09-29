package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//find the longest consecutive subsequence
public class LongestConsecutiveSubsequence {

    public static int consecutive(int[] arr){
        int n= arr.length;
        int count=1;
        int max=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            if(!s.contains(arr[i]-1)) {
                count=1;
                while(s.contains(arr[i]+1)) {
                    count++;
                    arr[i]++;
                }
                if(count>max)
                    max=count;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr={1,9,3,4,20,2};
        int x=consecutive(arr);
        System.out.println(x);
    }
}
