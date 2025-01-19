package src;

/**
 * L'algoritmo di ordinamento Quick Sort
 * ha una complessità temporale
 * media di (O(n \log n)).
 * Tuttavia, nel caso peggiore,
 * la complessità temporale può essere (O(n^2)).
 * Se pivot è il minore o il maggiore del valore :(O(n^2)).
 */
public class ArraySort04QuickSort {
    public static void main(String[] args) {
        int[] array = {8453, 6, 9, 332, 664, 5,24, 115,4, 25,34, 545};
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

    // Metodo per eseguire il quick sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Trova l'indice di partizione
            int pi = partition(array, low, high);

            // Ordina ricorsivamente gli elementi prima e dopo la partizione
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Metodo per trovare l'indice di partizione
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // Indice dell'elemento più piccolo
        for (int j = low; j < high; j++) {
            // Se l'elemento corrente è minore o uguale al pivot
            if (array[j] < pivot) {
                i++;

                // Scambia array[i] e array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                printArray(array);
            }
        }

        // Scambia array[i + 1] e array[high] (o pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}