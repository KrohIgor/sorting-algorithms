import java.util.Arrays;

public class MargeSort {

    public static void main(String[] args) {
        int[] array = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        int[] result = sort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] array) {
        int[] arrayBuffer = new int[array.length];
        return sortInner(array, arrayBuffer, 0, array.length);
    }

    public static int[] sortInner(int[] array, int[] arrayBuffer, int start, int end) {
        if (start >= end - 1) {
            return array;
        }
        int middle = start + (end - start) / 2;
        int[] sorted1 = sortInner(array, arrayBuffer, start, middle);
        int[] sorted2 = sortInner(array, arrayBuffer, middle, end);

        int index1 = start;
        int index2 = middle;
        int step = start;
        int[] result;
        if (sorted1 == array) {
            result = arrayBuffer;
        } else {
            result = array;
        }
        while (index1 < middle && index2 < end) {
            if (sorted1[index1] < sorted2[index2]) {
                result[step++] = sorted1[index1++];
            } else {
                result[step++] = sorted2[index2++];
            }
        }
        while (index1 < middle) {
            result[step++] = sorted1[index1++];
        }
        while (index2 < end) {
            result[step++] = sorted2[index2++];
        }
        return result;
    }
}
