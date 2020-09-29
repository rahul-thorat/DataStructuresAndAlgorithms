package Arrays;

import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
      int[] a={1, 2, 1};
      int n=a.length;
      int[] b=new int[n];
      b[0]=a[0];
      for(int i=1;i<n;i++){
          b[i]=b[i-1]+a[i];
      }
      //System.out.println(Arrays.toString(b));
        int sum=0;
      for(int i=0;i<n;i++){
          sum=+a[i];
      }
       // System.out.println(sum);

        for(int i=1;i<n;i++){
            if(b[i-1]==sum-b[i]){
                System.out.println(i);
                System.out.println(b[i]);
                break;
            }
        }

    }
}
