package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Count no of distinct elements in every window
public class DistinctElements {

    public static void distinct(int arr[],int windowSize){
        int n= arr.length;
        Map<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<windowSize;i++){
            if(s.containsKey(arr[i])){
                s.put(arr[i],s.get(arr[i])+1);
            }
            else
                s.put(arr[i],1);
        }
        System.out.println(s.size());
        for(int i=windowSize;i<n;i++){
            if (s.get(arr[i - windowSize]) == 1) {
                s.remove(arr[i - windowSize]);
            }
            else
                s.put(arr[i - windowSize],  s.get(arr[i - windowSize]) - 1);

            s.put(arr[i], s.getOrDefault(arr[i], 0) + 1);
            System.out.println(s.size());
        }
    }

    public static void main(String[] args) {
        int arr[] ={10,20,20,10,30,40,10};
        int k=4;
        distinct(arr,k);
    }
}
