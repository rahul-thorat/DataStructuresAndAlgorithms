package Recursion;

public class SumOfNaturalNo {

    static int sum(int n){
        if(n<0)
            return 0;
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
       int x= sum(4);
       System.out.println(x);
    }
}
