package Strings;

//Given a string find the leftmost character that repeats
public class RepeatChar {

    static int index(String s){
        int n=s.length();
        int[] ch=new int[256];
        int res=257;
        for(int i=0;i<256;i++){
            ch[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(ch[s.charAt(i)]==-1)
                ch[s.charAt(i)]=i;
            else
                res=Math.min(res,ch[s.charAt(i)]);
        }

        return res;
    }

    public static void main(String[] args) {
        String s="geeksfor";
        int x=index(s);
        System.out.println(x);
    }
}
