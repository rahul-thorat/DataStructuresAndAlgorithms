package Recursion;

public class TowerOfHanoi {

    static void moves(int n,char a,char b,char c){
        if(n<1)
            return;
        moves(n-1,a,c,b);
        System.out.println(n+"from"+a+"to"+c);
        moves(n-1,b,a,c);
    }

    public static void main(String[] args) {
        moves(1,'A','B','C');


    }
}
