package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer4_criacao_de_metodo_para_calcular_a_idade_baseada_no_ano_de_nascimento;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Validador validador = new Validador();
        Idade idade = new Idade();
        int ano;
        int idade1 = 0;

        System.out.print("Insira o seu ano de nascimento: ");
        ano = scanner.nextInt();


        validador.descobrir(ano, idade1);

        idade.definir(idade1);

        System.out.print("Você tem "+ idade1 +" anos.\n");
    }
}
