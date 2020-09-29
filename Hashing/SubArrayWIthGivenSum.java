package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//find subarray with given sum
public class SubArrayWIthGivenSum {
    public static void main(String[] args) {
        int[] a={5,8,6,13,3,-1};
        int sum=22;
        int[] pre=new int[a.length];
        pre[0]=a[0];
        for(int i=1;i<a.length;i++){
            pre[i]=pre[i-1]+a[i];
        }
        System.out.println(Arrays.toString(pre));
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<pre.length;i++){
            if(pre[i]==sum){
                System.out.println(i);
            }
            else if(s.contains(pre[i]-sum)){
                System.out.println(i);
            }
            else
                s.add(pre[i]);
        }
    }
}
