package Hashing;

import java.util.HashSet;
import java.util.Set;

//Find the pair with given sum in an unsorted array
public class PairWithSum {
    public static void main(String[] args) {
        int a[]={3,2,8,15,-8};
        int sum=17;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(s.contains(sum-a[i]))
                System.out.println("true");
            else
                s.add(a[i]);
        }


    }
}
