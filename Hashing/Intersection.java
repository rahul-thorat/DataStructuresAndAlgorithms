package Hashing;

import java.util.HashSet;
import java.util.Set;

//count of elements in Intersection of 2 arrays
public class Intersection {
    public static void main(String[] args) {
        int a[]={15,20,5,15,16};
        int b[]={15,15,15,20,10,16,16};

        Set<Integer> s=new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        int count=0;
        for(int i=0;i<b.length;i++){
            if(s.contains(b[i])){
                count++;
                s.remove(b[i]);
            }
        }
        System.out.print(count);
    }
}
