package Strings;

import java.util.Arrays;

//KMP algorithm for pattern matching
public class KMP extends LPS{

    public static void KMP(String s,String p){
        int N=s.length();
        int M=p.length();
        int[] lps=lpsArray(p);
        System.out.println(Arrays.toString(lps));
        int i=0,j=0;
        while(i<N){
            if(s.charAt(i)==p.charAt(j)){
                i++;
                j++;
            }
            if(j==M){
                System.out.println(i-M);
                j=lps[j-1];
            }
            else if(i<N && p.charAt(j)!=s.charAt(i)){
                if(j==0)
                    i++;
                else{
                    j=lps[j-1];
                }
            }
        }
    }

    public static void main(String[] args) {
        String s="ababcababaad";
        String p="ababa";
        KMP(s,p);
    }
}
