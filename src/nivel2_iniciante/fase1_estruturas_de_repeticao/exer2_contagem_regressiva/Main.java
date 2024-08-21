package nivel2_iniciante.fase1_estruturas_de_repeticao.exer2_contagem_regressiva;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        int limit;

        System.out.println("Insira em qual número deseja iniciar a contagem: ");
        num = scanner.nextInt();
        System.out.println("Insira em qual número deseja parar: ");
        limit = scanner.nextInt();

        while (num >= limit){
            System.out.println(num);
            num--;//O mesmo que fazer num = num - 1
        }
    }
}
