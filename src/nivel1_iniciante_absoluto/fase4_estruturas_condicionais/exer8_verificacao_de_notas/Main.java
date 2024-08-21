package nivel1_iniciante_absoluto.fase4_estruturas_condicionais.exer8_verificacao_de_notas;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int nota1, nota2, nota3;
        int media;

        System.out.println("Insira sua nota1: ");
        nota1 = scanner.nextInt();
        System.out.println("Insira sua nota2: ");
        nota2 = scanner.nextInt();
        System.out.println("Insira sua nota3: ");
        nota3 = scanner.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        if(media < 6){
            System.out.println("Você foi reprovado");
        }else{
            System.out.println("Você foi aprovado");
        }
    }
}
