package nivel3_intermediario.fase2_introducao_a_arrays.exer3_encontre_o_maior_elemento_em_um_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int maior = 0;

        for(int i = 0; i < 3; i++){
            System.out.print("Insira o número: ");
            int num = scanner.nextInt();
            numeros.add(num);
        }

        for(Integer atual : numeros){
            if(atual > maior ){
                maior = atual;
            }
        }

        System.out.print("O maior é: "+ maior);
    }
}
