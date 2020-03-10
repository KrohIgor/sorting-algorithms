import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        int[] result = sort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] array) {
        quickSort(array, 0, array.length);
        return array;
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start >= end - 1) {
            return;
        }
        int supportingElement = array[end - 1];
        int index = end - 2;
        for (int i = start; i < index + 1; i++) {
            if (array[i] > supportingElement) {
                int temp = array[i];
                if (index - i >= 0) System.arraycopy(array, i + 1, array, i, index - i);
                array[index--] = supportingElement;
                array[index + 2] = temp;
                i--;
            }
        }
        quickSort(array, start, index + 1);
        quickSort(array, index + 1, end);
    }
}
