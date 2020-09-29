package Strings;

//rabin karp algorithm for pattern matching
public class RabinKarp {

    public final static int d = 256;


    public static void rabin(String t,String p,int q){
        int M=p.length();
        int N=t.length();
        int hp=0;//hash of pattern
        int ht=0;//hash of text
        int h=1;

        for(int i=0;i<M-1;i++){
            h=(h*d)%q;
        }

        for(int i=0;i<M;i++){
            hp=(hp*d + p.charAt(i))%q;
            ht=(ht*d + t.charAt(i))%q;
        }

        for(int i=0;i<=N-M;i++){
            if(hp==ht){
                boolean flag=true;
                for(int j=0;j<M;j++){
                    if(p.charAt(j)!=t.charAt(i+j)){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    System.out.print(i+" ");
                }
            }
            if(i<N-M){
                ht=(d*(ht-t.charAt(i)*h)+t.charAt(i+M))%q;
                if (ht < 0)
                    ht = (ht + q);
            }

        }

    }


    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        int q = 101; // A prime number
        rabin(txt, pat, q);
    }
}
