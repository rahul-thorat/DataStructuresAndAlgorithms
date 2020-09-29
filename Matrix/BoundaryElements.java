package Matrix;

//print boundary elements of a matrix
public class BoundaryElements {
    public static void main(String[] args) {
        int[][] m={{1,2,3},
                   {4,5,6},
                   {7,8,9},
                   {10,11,12}};
        int top=0;
        int left=0;
        int right=m[0].length-1;
        int bottom=m.length-1;

        for(int i=0;i<m[0].length;i++){
            System.out.print(m[top][i]+" ");
        }
        top++;
        while(top<bottom) {
            System.out.print(m[top][right]+" ");
            top++;
        }
        for(int i=m[0].length-1;i>=0;i--){
            System.out.print(m[bottom][i]+" ");
        }
        bottom--;
        while(bottom>0){
            System.out.print(m[bottom][left]+" ");
            bottom--;
        }
    }
}
