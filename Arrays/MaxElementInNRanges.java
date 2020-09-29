package Arrays;

import java.util.ArrayList;

public class MaxElementInNRanges {
    public static void main(String[] args) {
        int[] L = { 2, 8, 15, 1 };
        int[] R = { 6, 10, 18, 3 };
        int n=L.length;

        ArrayList<Integer> a=new ArrayList<>(100);

        for(int i=0;i<1000;i++){
            a.add(0);
        }

        //System.out.println(a);
        for(int i=0;i<n;i++) {
            a.set(L[i], a.get(L[i]) + 1);
            a.set(R[i] + 1, a.get(R[i]+1) - 1);
        }

        System.out.println(a);
        for(int i=1;i<1000;i++){
            a.set(i,a.get(i-1)+a.get(i));
        }
        System.out.println(a);

        int max=-1;
        for(int i=0;i<1000;i++){
            if(a.get(i)>max){
                max=i;
            }
        }
        System.out.println(max);

    }
}
