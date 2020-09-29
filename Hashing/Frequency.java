package Hashing;

import java.util.HashMap;
import java.util.Map;

//count frequency of elements in an array
public class Frequency {
    public static void main(String[] args) {
        int[] arr={15,12,13,12,13,13,18};
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }
            else
                m.put(arr[i],1);
        }
        System.out.println(m);
    }
}
