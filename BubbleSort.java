import java.util.Random;

public class BubbleSort {
    
    public static void ordenacaoBolha(int[] arr) {
        int n = arr.length;
        long trocas = 0;
        long comparacoes = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocas++;
                }
            }
        }
        
        System.out.println("Número de comparações: " + comparacoes);
        System.out.println("Número de trocas: " + trocas);
    }

    public static void main(String[] args) {
        int[] tamanhos = {10000, 100000, 1000000};
        Random random = new Random();
        
        for (int tamanho : tamanhos) {
            int[] arr = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                arr[i] = random.nextInt(); // Preenche o vetor com números aleatórios
            }
            
            long tempoInicial = System.currentTimeMillis();
            ordenacaoBolha(arr);
            long tempoFinal = System.currentTimeMillis();
            long tempoExecucao = tempoFinal - tempoInicial;
            
            System.out.println("Tamanho do vetor: " + tamanho);
            System.out.println("Tempo de execução (ms): " + tempoExecucao);
        }
    }
}

