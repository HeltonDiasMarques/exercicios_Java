package nivel2_iniciante.fase4_funcoes_e_metodos.exer3_funcao_para_verificar_se_um_numero_e_primo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Insira o número que deseja analisar: ");
        num = scanner.nextInt();

        boolean par = analise(num);

        if (par) {
            System.out.println(num + " é um número par.");
        } else {
            System.out.println(num + " é um número ímpar.");
        }
    }

    public static boolean analise(int num) {
        if (num == 0) {
            System.out.println("0 é um número neutro, insira outro.");
            return false;
        }
        return num % 2 == 0;
    }
}