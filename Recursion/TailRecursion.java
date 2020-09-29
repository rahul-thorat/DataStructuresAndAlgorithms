package Recursion;
//factorial tail recursion
public class TailRecursion {

    static int factorial(int n,int val){
        if(n<=1)
            return val;
        else
            return factorial(n-1,val*n);
    }

    public static void main(String[] args) {
        int x=factorial(5,1);
        System.out.println(x);
    }
}

