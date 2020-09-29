package Strings;

//Given a string find the leftmost character that doesn't repeat
public class NonRepeat {

    static int nonrepeat(String s){
        int n=s.length();
        int[] ch=new int[256];
        for(int i=0;i<256;i++){
            ch[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(ch[s.charAt(i)]==-1)
                ch[s.charAt(i)]=i;
            else
                ch[s.charAt(i)]=-2;
        }
        int res=999999999;
        for(int i=0;i<256;i++){
            if(ch[i]>=0)
               res=Math.min(res,ch[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        String s="geegh";
        int x=nonrepeat(s);
        System.out.println(x);
    }
}
