package Strings;

//check iff 2 strings are rotations of each other
public class RotationsOfEachOther {

    static boolean roations(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        s1=s1+s1;
        if(s1.indexOf(s2)!=-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1="abcadef";
        String s2="cdefab";
        boolean b=roations(s1,s2);
        System.out.println(b);
    }
}
