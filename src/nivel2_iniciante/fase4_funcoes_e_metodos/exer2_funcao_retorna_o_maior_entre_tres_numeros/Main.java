package nivel2_iniciante.fase4_funcoes_e_metodos.exer2_funcao_retorna_o_maior_entre_tres_numeros;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int [] vetor1 = {0, 0, 0};
        int maior;

        System.out.print("Insira o primeiro número: ");
            vetor1[0] = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
            vetor1[1] = scanner.nextInt();

        System.out.print("Insira o terceiro número: ");
            vetor1[2] = scanner.nextInt();

        maior = maior(vetor1);

        System.out.println("O maior número é: "+ maior);
    }

    public static int maior(int[] vetor1) {
        int maior = vetor1[0];

        for(int i = 0; vetor1.length > i; i++){
            if(maior < vetor1[i]){
                maior = vetor1[i];
            }
        }

        return maior;
    }
}
