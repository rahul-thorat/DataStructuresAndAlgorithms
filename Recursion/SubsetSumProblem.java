package Recursion;

public class SubsetSumProblem {

    static int subsetSum(int[] arr,int n,int curr,int sum,int count){

        if(curr==sum){
           count++;
           return count;
        }

        if(n==arr.length){
            return 0;
        }

        return subsetSum(arr,n+1,curr,sum,count)+subsetSum(arr,n+1,curr+arr[n],sum,count);
    }

    public static void main(String[] args) {

        int[] arr={ 3, 3, 3, 3 };
        int c=subsetSum(arr,0,0,6,0);
        System.out.println(c);
    }
}
