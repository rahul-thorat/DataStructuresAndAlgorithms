package Recursion;

public class SubseqOfString {

    static void subSeq(String s,String curr,int n) {
       if(n==s.length()){
           System.out.println(curr+" ");
           return;
       }
       subSeq(s,curr,n+1);
       subSeq(s,curr+s.charAt(n),n+1);
    }

    public static void main(String[] args) {
       subSeq("ABC","",0);
        //String s="ABC";
        //System.out.println(s.substring(2));
    }
}
