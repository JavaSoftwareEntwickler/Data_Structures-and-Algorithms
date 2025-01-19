package src;




/***
 * Merge Sort is a stable sorting algorithm that divides the array into two halves
 * and then merges the two halves. The merge operation is performed recursively.
 *
 * Time Complexity:
 * Best Case: O(n log n)
 * Average Case: O(n log n)
 * Worst Case: O(n log n)
 *
 * Space Complexity: O(n)
 *
 * * L'algoritmo di ordinamento Merge Sort ha le seguenti complessità:
 *  * Complessità temporale:
 *  * Caso migliore: (O(n \log n))
 *  * Caso medio: (O(n \log n))
 *  * Caso peggiore: (O(n \log n))
 *  * Complessità spaziale:
 *  * (O(n))
 *  * Il Merge Sort è un algoritmo di ordinamento
 *  * stabile e divide l'array in due metà,
 *  * ordina ciascuna metà ricorsivamente e poi le unisce.
 *  * La complessità temporale è (O(n \log n)) in tutti i casi
 *  * perché l'array viene diviso a metà ad ogni passo
 *  * e richiede tempo lineare per unire le metà.
 *  * La complessità spaziale è (O(n)) perché richiede
 *  * spazio aggiuntivo per i sottoarray temporanei utilizzati durante il processo di unione.
 */
public class ArraySort05MergeSort {
    public static void main(String[] args) {
        int[] array = {8, 6, 9, 2, 4, 5};
        mergeSort(array, 0, array.length - 1);
        printArray(array);
    }

    // Metodo per eseguire il merge sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Trova il punto medio dell'array
            int mid = (left + right) / 2;

            // Ordina la prima e la seconda metà
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Unisci le metà ordinate
            merge(array, left, mid, right);
        }
    }

    // Metodo per unire due sottoarray ordinati
    public static void merge(int[] array, int left, int mid, int right) {
        // Trova le dimensioni dei due sottoarray da unire
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Crea array temporanei
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copia i dati nei sottoarray temporanei
        for (int i = 0; i < n1; ++i) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[mid + 1 + j];
        }

        // Unisci i sottoarray temporanei

        // Indici iniziali dei primi e secondi sottoarray
        int i = 0, j = 0;

        // Indice iniziale dell'array unito
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copia gli elementi rimanenti di L[], se ce ne sono
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copia gli elementi rimanenti di R[], se ce ne sono
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Metodo per stampare l'array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}