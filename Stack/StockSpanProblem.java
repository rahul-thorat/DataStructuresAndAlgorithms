package Stack;

import java.util.Stack;

public class StockSpanProblem {

    static void span(int[] arr){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i< arr.length;i++){

            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.println(i+1);
            }
            else
                System.out.println(i-s.peek());
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] arr={40,30,20,10};
        span(arr);
    }
}
