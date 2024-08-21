package nivel1_iniciante_absoluto.fase4_estruturas_condicionais.exer6_verificacao_de_idade;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Insira a sua idade: ");
        idade = scanner.nextInt();

        if(idade < 18){
            System.out.println("Você é menor de idade.");
        }else{
            System.out.println("Você é maior de idade.");
        }
    }
}
