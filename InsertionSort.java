import java.util.Random;

public class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        long comparacoes = 0;
        long trocas = 0;
        
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                comparacoes++;
                trocas++;
            }
            arr[j + 1] = key;
            trocas++;
        }
        
        System.out.println("Número de comparações: " + comparacoes);
        System.out.println("Número de trocas: " + trocas);
    }
    
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size * 10); 
        }
        return arr;
    }
    
    public static void main(String[] args) {
        
        int[] sizes = {10000, 100000, 1000000};
        
        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            long startTime = System.currentTimeMillis();
            insertionSort(arr);
            long endTime = System.currentTimeMillis();
            System.out.println("Tamanho do array: " + size);
            System.out.println("Tempo de execução (ms): " + (endTime - startTime));
            System.out.println("-------------------------------------------------");
        }
    }
}