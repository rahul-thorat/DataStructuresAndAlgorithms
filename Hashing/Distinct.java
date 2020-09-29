package Hashing;

import java.util.HashSet;
import java.util.Set;

//count distinct elements in an array
public class Distinct {
    public static void main(String[] args) {
        int[] arr={15,12,13,12};

        Set<Integer> s=new HashSet<>(arr.length);
        for(int i=0;i< arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s.size());

    }
}
