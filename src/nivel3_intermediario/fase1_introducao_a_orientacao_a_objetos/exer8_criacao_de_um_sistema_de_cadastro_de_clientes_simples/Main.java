package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer8_criacao_de_um_sistema_de_cadastro_de_clientes_simples;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String nome;
        String email;

        System.out.print("Insira o nome do cliente: ");
        nome = scanner.next();

        System.out.print("Insira o email do cliente: ");
        email = scanner.next();

        Clientes cliente = new Clientes(nome, email);

        System.out.print(nome + email);
    }
}
