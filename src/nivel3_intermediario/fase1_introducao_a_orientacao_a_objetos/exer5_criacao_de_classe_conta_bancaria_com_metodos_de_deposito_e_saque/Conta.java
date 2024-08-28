package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer5_criacao_de_classe_conta_bancaria_com_metodos_de_deposito_e_saque;

import java.util.Scanner;

public class Conta {
    int valor;
    Scanner scanner = new Scanner(System.in);
    public int deposito(int saldo){
        System.out.print("Insira o valor que deseja depositar: ");
        valor = scanner. nextInt();
        return saldo + valor;
    }

    public int saque(int saldo){
        System.out.print("Insira o valor que deseja sacar: ");
        valor = scanner. nextInt();
        return saldo - valor;
    }
}
