package nivel2_iniciante.fase2_vetores_sem_Array.exer1_criacao_de_vetor;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int [] vetor = {1, 2, 3, 4, 5};

        for(int i = 0; i <= vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
