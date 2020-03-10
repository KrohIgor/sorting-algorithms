import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{6, 5, 3, 1, 8, 7, 2, 4})));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean permutationsWere = false;
            for (int j = 0; j < array.length - i - 1; j++) {
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
