package nivel2_iniciante.fase2_vetores_sem_Array.exer5_ordenacao;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {5, 1, 3, 4, 2};
        int menor;
        int temp;

        for (int i = 0; i < vetor.length - 1; i++) {
             menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            temp = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = temp;
            }

        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
