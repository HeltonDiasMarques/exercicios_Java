package nivel2_iniciante.fase1_estruturas_de_repeticao.exer15_desenho_de_quadrado;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int largura;
        int tamanho;

        System.out.println("Insira o tamanho da quadrado: ");
        tamanho = scanner.nextInt();

        System.out.println("Insira o largura da quadrado: ");
        largura = scanner.nextInt();

        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j <  largura; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
