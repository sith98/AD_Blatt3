import java.util.Arrays;

public class Aufgabe4 {
    private static final int[] exampleArray = {-5, 13, -32, 7, -3, 17, 23, 12, -35, 19};

    private static int[] getExampleArray() {
        return Arrays.copyOf(exampleArray, exampleArray.length);
    }

    private static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }


    private static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers));
            int value = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > value) {
                numbers[j + 1] = numbers[j];
                j -= 1;
            }
            numbers[j + 1] = value;
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] numbers) {
        for (int end = numbers.length; end >= 0; end--) {
            System.out.println(Arrays.toString(numbers));
            for (int i = 0; i < end - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i + 1);
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers));
            int largestIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[largestIndex]) {
                    largestIndex = j;
                }
            }
            swap(numbers, i, largestIndex);
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        System.out.println("Bubble sort:");
        bubbleSort(getExampleArray());
        System.out.println("Insertion sort:");
        insertionSort(getExampleArray());
        System.out.println("Selection sort:");
        selectionSort(getExampleArray());
    }


}
