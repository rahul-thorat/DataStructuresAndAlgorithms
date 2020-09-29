package Matrix;

public class Rotate90Degree {
    public static void main(String[] args) {
        int[][] m={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        for(int i=0;i<m.length;i++){
            for(int j=i+1;j<m[i].length;j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }

        for(int i=0;i<m.length;i++){
            int low=0;int high=m.length-1;
            while(low<high){
                int temp=m[low][i];
                m[low][i]=m[high][i];
                m[high][i]=temp;
                low++;
                high--;
            }
        }

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
