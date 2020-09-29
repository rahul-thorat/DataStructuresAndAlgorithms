package Matrix;

public class SpiralForm {
    public static void main(String[] args) {
        int[][] m={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int top=0;
        int left=0;
        int right=m[0].length-1;
        int bottom=m.length-1;

        while(true) {
            if (left > right) {
                break;
            }

            for (int i = left; i <=right; i++) {
                System.out.print(m[top][i] + " ");
            }
            top++;
            if (top > bottom) {
                break;
            }


            for(int i=top;i<=bottom;i++){
                System.out.print(m[i][right] + " ");
            }
            right--;
            if (left > right) {
                break;
            }

            for (int i = right; i >= left; i--) {
                System.out.print(m[bottom][i] + " ");
            }
            bottom--;
            if (top > bottom) {
                break;
            }

            for(int i=bottom;i>=top;i--){
                System.out.print(m[i][left] + " ");
            }
            left++;

        }

    }
}
