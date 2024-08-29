package nivel3_intermediario.fase2_introducao_a_arrays.exer9_reversao_de_um_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();

        int cont = 0;
        String input;
        int num;

        while(true){
            System.out.print("Insira o número(Caso tenha encerrado, deixe em branco): ");
            input = scanner.nextLine();

            if(input.isBlank()){
                break;
            }

            num = Integer.parseInt(input);
            numeros1.add(num);
        }

        for(int i = numeros1.size() - 1 ; i >= 0; i--){
            numeros2.add(numeros1.get(i));
        }

        for(Integer atual : numeros2){
            System.out.println(atual);
        }
    }
}