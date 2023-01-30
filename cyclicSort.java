import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
     int[] arr1={2,4,5,1,3};
     sort(arr1);
    }
    static void sort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
