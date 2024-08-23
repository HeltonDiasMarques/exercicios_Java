package nivel2_iniciante.fase2_vetores_sem_Array.exer4_busca;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int [] vetor = {1, 2, 3, 4, 5};

        int encontre;
        boolean achou = false;

        System.out.println("Escolha um número para encontrar: ");
        encontre = scanner.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if(encontre == vetor[i]){
                achou = true;
            }
        }

        if(achou){
            System.out.println("O número "+ encontre +" foi encontrado.");
        }else{
            System.out.println("O número "+ encontre +" não foi encontrado.");
        }
    }
}
