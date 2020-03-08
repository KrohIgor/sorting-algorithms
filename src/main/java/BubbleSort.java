import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{1, 8, 4, 6, 2, 7, 3, 15, 5})));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean permutationsWere = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    permutationsWere = true;
                }
            }
            if (!permutationsWere) {
                break;
            }
        }
        return array;
    }
}
