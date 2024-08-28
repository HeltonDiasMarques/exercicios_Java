package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer5_criacao_de_classe_conta_bancaria_com_metodos_de_deposito_e_saque;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        int saldo = 0;
        int retry = 1;

        while(retry != 0) {
            int opcao;

            System.out.println("Selecione uma opção" +
                    "\n[1] Deposito" +
                    "\n[2] Saque" +
                    "\n[3] Consultar saldo");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo = conta.deposito(saldo);
                    System.out.print("O seu saldo atual é R$" + saldo);
                    break;
                case 2:
                    saldo = conta.saque(saldo);
                    System.out.print("O seu saldo atual é R$" + saldo);
                    break;
                case 3:
                    System.out.print("O seu saldo atual é de R$" + saldo);
                    break;
                default:
                    System.out.print("Opção invalida.");
            }
            System.out.print("\nCaso NÃO deseje retornar, digite 0: ");
            retry = scanner.nextInt();
        }
        System.out.print("Obrigado por utilizar nosso banco!");
    }
}
