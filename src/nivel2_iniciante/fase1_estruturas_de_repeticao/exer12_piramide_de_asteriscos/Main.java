package nivel2_iniciante.fase1_estruturas_de_repeticao.exer12_piramide_de_asteriscos;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int base;
        int metade;

        System.out.println("Insira a base do triangulo: ");
        base = scanner.nextInt();

        metade = base / 2;
        if(base%2==0){
            for(int i = 0; i <= metade; i++){
                for(int j = 0; j <= i; j++){
                    System.out.print("*");

                }
                System.out.println();
            }
            metade++;
            for(int i = metade - 1; i < metade && i != 0; i--){
                for(int j = i; j < metade && j != 0; j--){
                    System.out.print("*");

                }
                System.out.println();
            }
        }else{
            System.out.println("Insira um número par.");
        }
    }
}
