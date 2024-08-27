package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer3_criacao_de_construtores_e_metodos_getters_e_setters;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        String nome;
        int idade;


        System.out.print("Nome: ");
        nome = scanner.next();

        System.out.print("Idade: ");
        idade = scanner.nextInt();

        pessoa.definir(nome, idade);
        System.out.print("Olá sou o "+ nome +" e tenho "+ idade +" anos");
    }
}
