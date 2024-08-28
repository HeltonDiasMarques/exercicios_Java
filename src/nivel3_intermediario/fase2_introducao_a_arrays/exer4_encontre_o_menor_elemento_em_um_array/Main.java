package nivel3_intermediario.fase2_introducao_a_arrays.exer4_encontre_o_menor_elemento_em_um_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            System.out.print("Insira o número: ");
            int num = scanner.nextInt();
            numeros.add(num);
        }

        int menor = numeros.get(0);

        for(Integer atual : numeros){
            if(atual < menor){
                menor = atual;
            }
        }

        System.out.print("O menor número é: "+ menor);
    }
}
