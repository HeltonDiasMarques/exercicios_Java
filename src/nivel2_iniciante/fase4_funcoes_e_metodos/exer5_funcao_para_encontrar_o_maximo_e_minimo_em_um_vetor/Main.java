package nivel2_iniciante.fase4_funcoes_e_metodos.exer5_funcao_para_encontrar_o_maximo_e_minimo_em_um_vetor;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int [] vetor = {1, 2, 3, 4, 5};
        int maior = maior(vetor);
        int menor = menor(vetor);

        System.out.println("O maior número é "+ maior +" e o menor número é "+ menor);
    }

    public static int maior(int [] vetor){
        int maior = vetor[0];
        int menor = vetor[0];
        for(int i = 0; i <  vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return menor;
    }

    public static int menor(int [] vetor){
        int menor = vetor[0];
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i]<menor){
                menor = vetor[i];
            }
        }
        return menor;
    }
}
