package Strings;

import java.util.Arrays;

public class LongestSubStringWithDistinctChar {
    public static void distinct(String s){
        int n=s.length();
        int[] max=new int[n];
        int[] ch=new int[256];
        max[0]=1;
        for(int i=0;i<256;i++){
            ch[i]=-1;
        }
        int res=0;
        ch[s.charAt(0)]=0;
        for(int i=1;i<n;i++){
            if(ch[s.charAt(i)]==-1){
                max[i]=max[i-1]+1;
            }
            else{
                max[i]=Math.min(max[i-1]+1,i-ch[s.charAt(i)]);

            }
            ch[s.charAt(i)]=i;

            if(max[i]>res){
                res=max[i];
            }

        }

        System.out.println(Arrays.toString(max));
        System.out.println(res);

    }

    public static void main(String[] args) {
        String s="ABDEFGABEF";
        distinct(s);

    }
}
