package Strings;


import java.util.Arrays;

//Find the longest proper prefix which is also suffix
public class LPS {

    public static int[] lpsArray(String s){
        int n=s.length();
        int[] lps=new int[s.length()];
        lps[0]=0;
        int i=0,j=1;

        while(j<n){
            if(s.charAt(i)==s.charAt(j)){
                lps[j]=i+1;
                i++;
                j++;
            }
            else{
                if(i==0){
                    lps[j]=0;
                    j++;
                }
                else{
                    i=lps[i-1];
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {

        String s="abbabb";
        System.out.println(Arrays.toString(lpsArray(s)));
    }
}
