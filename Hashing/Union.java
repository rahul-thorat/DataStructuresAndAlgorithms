package Hashing;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//no of elements in Union of 2 unsorted arrays
public class Union {
    public static void main(String[] args) {
        int a[]={15,20,5,15,16};
        int b[]={15,15,15,20,10};
        Set<Integer> s=new HashSet<>(a.length+b.length);

        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            s.add(b[i]);
        }
        System.out.println(s.size());
    }
}
