package nivel1_iniciante_absoluto.fase3_entrada_e_saida_de_dados.exer5_ler_e_exibir_dados_do_usuario;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Insira o seu nome: ");
        num = scanner.nextInt();

        System.out.println("O número que você inseriu foi: "+ num);
    }
}
