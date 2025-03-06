import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        boolean swapped = true;
        for (int i = 0; i < len - 1; i++) {
            swapped = false;
            for (int j = 0; j < len-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {

        int arr[] = {20, 1, 2, 3, 10, 5, 4,50};
        bubbleSort(arr);
        for(int array : arr){
            System.out.println(array);
        }
        System.out.println(Arrays.toString(arr));

    }

}
