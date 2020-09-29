package Stack;

import java.util.Arrays;

//Implement 2 stacks in an array
public class TwoStacks {
    int capacity;
    static int top1;
    static int top2;
    static int n;
    static int[] arr;

   TwoStacks(int n){
        this.n=n;
        top1=-1;
        capacity=n;
        top2=capacity;
        arr=new int[n];
    }

    static void push1(int val){
       if(top1<top2-1) {
           top1++;
           arr[top1] = val;
       }
    }
    static void push2(int val) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = val;
        }
    }

    static void pop1(){
       if(top1!=-1){
           top1--;
       }
    }

    static void pop2(){
        if(top2!=n){
            top2++;
        }
    }

    static void print(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        TwoStacks two=new TwoStacks(5);
        push1(2);
        push1(9);
        push1(3);
        push2(5);
        push2(2);
        push2(7);
        print();
        pop1();
        pop1();
        push2(7);
        print();
    }



}
