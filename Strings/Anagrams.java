package Strings;

public class Anagrams {

    static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        int[] ch=new int[256];
        for(int i=0;i<s1.length();i++){
            ch[s1.charAt(i)]++;
           // System.out.println(ch[s1.charAt(i)]);
            ch[s2.charAt(i)]--;
            //System.out.println(ch[s2.charAt(i)]);
        }
        for(int i=0;i<256;i++){
            if(ch[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1="aaamm";
        String s2="maaam";
        boolean b=anagram(s1,s2);
        System.out.println(b);
    }
}
