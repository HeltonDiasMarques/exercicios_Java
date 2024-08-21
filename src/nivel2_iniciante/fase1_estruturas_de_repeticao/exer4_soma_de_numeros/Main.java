package nivel2_iniciante.fase1_estruturas_de_repeticao.exer4_soma_de_numeros;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int initial, aux = 0;
        int limit;

        System.out.println("Insira o inicio da contagem: ");
        initial = scanner.nextInt();
        System.out.println("Insira o final da contagem: ");
        limit = scanner.nextInt();

        while(initial <= limit){
            aux = initial + aux;
            initial++;
        }

        System.out.println("O resultado é: "+ aux);
    }
}
