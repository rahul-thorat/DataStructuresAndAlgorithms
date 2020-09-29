package Recursion;

public class MaximumPiecesOfRopeinSet {

    static int maxCuts(int n,int a,int b,int c){


        if(n==0)
            return 0;

        if(n<0)
            return -1;

        int temp= Math.max(Math.max(maxCuts(n-a,a,b,c),maxCuts(n-b,a,b,c)),maxCuts(n-c,a,b,c));

        if (temp==-1){
            return -1;
        }
        else
            return temp+1;

    }

    public static void main(String[] args) {

        int x=maxCuts(23,11,9,12);
        System.out.println(x);
    }
}

