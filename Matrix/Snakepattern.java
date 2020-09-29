package Matrix;

//Another solution is.. if(i%2==0) else{}
public class Snakepattern {
    public static void main(String[] args) {
        int[][] m={{1,2,3,4},
                   {4,5,6},
                   {7,8,9},
                {10,11,12,13}};
        boolean flag=true;
        for(int i=0;i<m.length;i++){
            if(flag==true) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j]+" ");
                    flag = false;
                }
            }
            else if (flag==false){
                for (int j = m[i].length-1; j>=0; j--) {
                    System.out.print(m[i][j]+" ");
                    flag = true;
                }
            }

        }
    }
}
