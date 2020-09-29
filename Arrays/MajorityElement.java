package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1, 3, 3, 1, 2};
        int count=1;
        int maj_index=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[maj_index]){
                count++;
            }
            else if(arr[i]!=arr[maj_index]){
                count--;
            }
            if(count==0){
                maj_index=i;
                count=1;
            }
        }
        System.out.println(arr[maj_index]);
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[maj_index])
                count++;
        }
        System.out.println(arr.length/2);
        System.out.println(count);


    }
}
