import java.util.Random;

public class SelectionSort {
    
    public static void ordenacaoSelecao(int[] arr) {
        int n = arr.length;
        long trocas = 0;
        long comparacoes = 0;
        
        for (int i = 0; i < n - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < n; j++) {
                comparacoes++;
                if (arr[j] < arr[indiceMin]) {
                    indiceMin = j;
                }
            }
            if (indiceMin != i) {
                int temp = arr[i];
                arr[i] = arr[indiceMin];
                arr[indiceMin] = temp;
                trocas++;
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
            ordenacaoSelecao(arr);
            long tempoFinal = System.currentTimeMillis();
            long tempoExecucao = tempoFinal - tempoInicial;
            
            System.out.println("Tamanho do vetor: " + tamanho);
            System.out.println("Tempo de execução (ms): " + tempoExecucao);
        }
    }
}

