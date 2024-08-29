package nivel3_intermediario.fase3_listas_e_colecoes.exer2_adicao_remocao_e_busca_de_elementos_em_uma_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        while(true){
            System.out.print("Insira o número: ");
            String input = scanner.nextLine();

            if(input.isBlank()){
                break;
            }

            int num = Integer.parseInt(input);
            numeros.add(num);
        }

        System.out.print("Insira o número que deseja remover: ");
        int encontre = scanner.nextInt();

        for(Integer atual : numeros){
            if(atual == encontre){
                numeros.remove(atual);
            }
        }

        for(Integer atual : numeros){
            System.out.println(atual);
        }
    }
}
