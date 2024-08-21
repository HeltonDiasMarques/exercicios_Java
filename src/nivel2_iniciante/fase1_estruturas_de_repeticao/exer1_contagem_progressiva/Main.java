package nivel2_iniciante.fase1_estruturas_de_repeticao.exer1_contagem_progressiva;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        int limit;

        System.out.println("Insira o número em que deseja iniciar sua contagem: ");
        num = scanner.nextInt();
        System.out.println("Agora o número que a contagem precisa parar: ");
        limit = scanner.nextInt();

        while(num <= limit){
            System.out.println(num);
            num++;//num++ é o mesmo que num = num + 1
        }
    }
}
