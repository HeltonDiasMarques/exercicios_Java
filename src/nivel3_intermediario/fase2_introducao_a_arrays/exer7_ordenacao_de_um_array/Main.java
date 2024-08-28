package nivel3_intermediario.fase2_introducao_a_arrays.exer7_ordenacao_de_um_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        String input;

        while(true){
            System.out.print("Insira os números(para encerrar não insira nada)");
            input = scanner.nextLine();
            if(input.isBlank()){
                 break;
            }
            int num = Integer.parseInt(input);
            numeros.add(num);
        }

        for(int i = 0; i < numeros.size(); i++){
            for(int j = 0; j < numeros.size(); j++){
                if(numeros.get(i) > numeros.get(j)){
                    int aux1 = numeros.get(i);
                    int aux2 = numeros.get(j);


                }
            }
        }

    }
}
