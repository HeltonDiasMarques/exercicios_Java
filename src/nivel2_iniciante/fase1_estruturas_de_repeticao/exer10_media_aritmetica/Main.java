package nivel2_iniciante.fase1_estruturas_de_repeticao.exer10_media_aritmetica;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        float media;
        int contador = 0;
        float notas;
        float sum = 0;

        for(int i = 0;i <= 20; i++){
            System.out.println("Insira o as notas(Caso tenha acabado, insira um número negativo): ");
            notas = scanner.nextFloat();
            if(notas < 0){
                break;
            }
            sum = sum + notas;
            contador++;
        }
         media = sum / contador;

        System.out.println("A media das notas é "+ media);
    }
}
