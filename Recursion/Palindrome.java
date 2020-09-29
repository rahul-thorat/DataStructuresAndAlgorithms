package Recursion;

public class Palindrome {
    static boolean Palindrome(String s,int l,int r){

        if(l<r){
            if(s.charAt(l)==s.charAt(r)){
                return Palindrome(s,l+1,r-1);
            }
            else
                return false;
        }
        else
            return true;
    }

    public static void main(String[] args) {
        boolean x=Palindrome("boob",0,3);

        System.out.println(x);
    }
}
