package Recursion;

public class JosephusProblem {

    static int survival(int n,int k){
      if(n==1)
          return 0;
      return (survival(n - 1, k) + k)%n;
    }

    public static void main(String[] args) {
        int x=survival(8,3);
        System.out.println(x);
    }
}
