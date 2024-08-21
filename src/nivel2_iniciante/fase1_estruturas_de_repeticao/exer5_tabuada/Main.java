package nivel2_iniciante.fase1_estruturas_de_repeticao.exer5_tabuada;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        int limit;
        int aux = 1;
        int result;

        System.out.println("De qual o numero que você deseja ver a tabuada?");
        num = scanner.nextInt();
        System.out.println("Qual seria o limite?");
        limit = scanner.nextInt();

        while(aux<=limit){
            result = num * aux;
            System.out.println(num +" X "+ aux +" = "+ result);
            aux++;
        }
    }
}
