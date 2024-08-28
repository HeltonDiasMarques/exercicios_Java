package nivel3_intermediario.fase2_introducao_a_arrays.exer6_contagem_de_elementos_pares_em_um_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        String input;
        int par = 0;
        int impar = 0;

        while (true){
            System.out.print("Insira os números que você deseja: ");
            input = scanner.nextLine();

            if (input.isEmpty()){
                break;
            }
            int num = Integer.parseInt(input);
            numeros.add(num);
        }

        for(Integer atual : numeros){
            if(atual%2==0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.print("Par: "+ par +
                        "\nImpar: "+ impar);
    }
}