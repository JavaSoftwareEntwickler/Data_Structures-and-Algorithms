package src;

public class ArraySort01BubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 6, 9, 2, 4, 5};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Scambia array[j] e array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            printArray(array);
        }
    }

    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}
