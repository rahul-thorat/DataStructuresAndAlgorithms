package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//SubArray with 0 sum
public class SubArrayWithSum {
    public static void main(String[] args) {
        int[] a={1,4,-3,0,2};
        int[] pre=new int[a.length];
        pre[0]=a[0];
        for(int i=1;i<a.length;i++){
            pre[i]=pre[i-1]+a[i];
        }
        System.out.println(Arrays.toString(pre));
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<pre.length;i++){
            if(pre[i]==0){
                System.out.println(i);
            }
            else if(s.contains(pre[i])){
                System.out.println(i);
            }
            else
                s.add(pre[i]);
        }
    }
}
