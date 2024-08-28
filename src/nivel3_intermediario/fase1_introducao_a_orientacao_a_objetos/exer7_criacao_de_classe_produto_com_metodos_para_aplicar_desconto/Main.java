package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer7_criacao_de_classe_produto_com_metodos_para_aplicar_desconto;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Desconto desconto = new Desconto();

        double valor;

        System.out.print("Insira o valor da compra: ");
        valor = scanner.nextDouble();

        valor = desconto.desconto(valor);

        System.out.print("O valor da compra com desconto é R$"+ valor);
    }
}
