package nivel3_intermediario.fase2_introducao_a_arrays.exer8_busca_de_um_elemento_especifico_em_um_array;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        String input;

        while (true){
            System.out.print("Insira o número(caso tenha terminado, apenas deixe em branco): ");
            input = scanner.nextLine();
            if(input.isBlank()){
                break;
            }

            int num = Integer.parseInt(input);
            numeros.add(num);
        }

        System.out.print("Insira o número que deseja encontrar: ");
        int encontre = scanner.nextInt();
        boolean encontrado = false;

        for(Integer atual : numeros){
            if(atual == encontre){
                encontrado = true;
            }
        }

        if(encontrado){
            System.out.print("O número "+ encontre +" foi encontrado!");
        }else{
            System.out.print("O número "+ encontre +" não foi encontrado!");
        }
    }
}
