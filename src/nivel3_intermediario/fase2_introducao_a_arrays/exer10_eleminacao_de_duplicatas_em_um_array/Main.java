package nivel3_intermediario.fase2_introducao_a_arrays.exer10_eleminacao_de_duplicatas_em_um_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        while(true){
            System.out.print("Insira o número: ");
            String input = scanner.nextLine();

            if(input.isBlank()){
                break;
            }

            int num = Integer.parseInt(input);
            numeros.add(num);
        }

        for(int i = 0; i < numeros.size(); i++){
            for(int j = numeros.size() - 1; j > i; j--){
                if(numeros.get(i).equals(numeros.get(j))){
                    numeros.remove(j);
                }
            }
        }

        for(Integer atual : numeros){
            System.out.println(atual);
        }
    }
}