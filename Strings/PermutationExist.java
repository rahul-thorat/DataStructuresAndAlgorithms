package Strings;

//Given a text string and pattern string find if a permutation of pattern string exists in the text
import java.util.*;
public class PermutationExist {

    static boolean patternMatch(String s1,String s2){

        int n=s2.length();
        int[] p=new int[256];
        int[] t=new int[256];
        for(int i=0;i<n;i++){
            p[s2.charAt(i)]++;
        }
        for(int i=0;i<n;i++){
            t[s1.charAt(i)]++;
        }
        for(int i=1;i<s1.length()-(n-1);i++){
            if(Arrays.equals(p,t))
                return true;
            else{
                t[s1.charAt(i-1)]--;
                System.out.println(s1.charAt(i-1));
                t[s1.charAt(i+n-1)]++;
                System.out.println(s1.charAt(i+n-1));
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String s1="mfseeksforgeeks";
        String s2="egek";
        boolean b=patternMatch(s1,s2);
        System.out.println(b);

    }
}
