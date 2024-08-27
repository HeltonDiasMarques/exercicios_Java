package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer2_criacao_de_classe_pessoa_com_metodos_para_definir_nome_e_idade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Insira o seu nome: ");
        String nome = scanner.next();

        System.out.print("Agora insira sua idade: ");
        int idade = scanner.nextInt();

        pessoa.definirNomeEIdade(nome, idade);

        pessoa.apresentar();
    }
}
