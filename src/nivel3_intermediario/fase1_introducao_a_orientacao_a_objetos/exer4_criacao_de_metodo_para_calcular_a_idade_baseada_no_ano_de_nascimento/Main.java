package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer4_criacao_de_metodo_para_calcular_a_idade_baseada_no_ano_de_nascimento;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Validador validador = new Validador();

        int ano;

        System.out.print("Insira o seu ano de nascimento: ");
        ano = scanner.nextInt();

        int idade  = validador.descobrir(ano);
        System.out.print("Você tem "+ idade +" anos.\n");
    }
}
