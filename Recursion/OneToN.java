package Recursion;

public class OneToN {

    static void oneToN(int n){
        if(n<1)
            return;
        oneToN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        oneToN(110);
    }
}
