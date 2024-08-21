package nivel2_iniciante.fase1_estruturas_de_repeticao.exer7_sequencia_fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int fibonacci = 1;

        int limit;

        System.out.println("Insira aonde que parar na sequência: ");
        limit = scanner.nextInt();

        while(limit > fibonacci ){
            
            System.out.println(fibonacci);
        }
    }
}
