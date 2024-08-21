package nivel2_iniciante.fase1_estruturas_de_repeticao.exer6_fatorial;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int fatorial;
        int aux = 1;

        System.out.println("Insira o número que deseja saber o seu fatorial: ");
        fatorial = scanner.nextInt();



        for(int i = fatorial; i > 0; i--){
            aux = i * aux;
        }

        System.out.println(fatorial+"! = "+ aux);
    }
}
