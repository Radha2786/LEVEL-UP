import java.util.Arrays;

public class Quick_sort {

    public static void swap (int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];

        arr[j] = temp;
    }

    public static int partition (int [] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;

        while ( i < j ){
            while ( arr[i] <= pivot && i < high)
                i++;
            while ( arr[j] > pivot && j > low )
                j--;

            if ( i < j )
                swap (arr, i, j);
        }

        swap (arr, low, j);
        return j;
    }

    public static void quickSort (int [] arr, int low, int high){
        if ( low < high ){
            int index = partition (arr, low, high);
            quickSort (arr, low, index - 1);
            quickSort (arr, index + 1, high);
        }
    }

    public static void main (String[] args) {
        int [] arr = {5, 3, 2, 6, 4, 1, 3, 7};
        quickSort (arr, 0, arr.length - 1);
        System.out.println (Arrays.toString (arr));
    }
}
