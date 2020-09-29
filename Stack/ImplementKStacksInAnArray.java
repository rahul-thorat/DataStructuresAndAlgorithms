package Stack;

public class ImplementKStacksInAnArray {

    static int[] arr,next,top;
    static int k,freeTop,cap,free;

    ImplementKStacksInAnArray(int[] arr, int k){
        this.k=k;
        this.arr=arr;
        cap=arr.length;
        top=new int[k];
        next=new int[cap];
        freeTop=0;
        for(int i=0;i<k;i++){
            top[i]=-1;
        }

        for(int i=0;i<cap-1;i++){
            next[i]=i+1;
        }
        next[cap-1]=-1;
    }

    static void push(int x,int sn){
       int i=freeTop;
       arr[i]=x;
       freeTop= next[i];
       next[i]=top[sn];
       top[sn]=i;
    }

    static int pop(int sn){
        int i=top[sn];
        top[sn]=next[i];
        next[i]=freeTop;
        freeTop=i;
        return arr[i];
    }
}
