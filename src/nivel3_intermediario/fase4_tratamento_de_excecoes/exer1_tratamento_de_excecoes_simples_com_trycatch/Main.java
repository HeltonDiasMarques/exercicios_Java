package nivel3_intermediario.fase4_tratamento_de_excecoes.exer1_tratamento_de_excecoes_simples_com_trycatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Tenta acessar um índice inválido em um array
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Isso vai lançar ArrayIndexOutOfBoundsException

            // Tenta realizar uma divisão por zero
            int resultado = 10 / 0; // Isso vai lançar ArithmeticException

        } catch (ArrayIndexOutOfBoundsException e) {
            // Captura o erro de índice inválido no array
            System.out.println("Erro: Tentativa de acessar um índice inválido do array.");

        } catch (ArithmeticException e) {
            // Captura o erro de divisão por zero
            System.out.println("Erro: Operação aritmética inválida.");

        } catch (Exception e) {
            // Captura qualquer outro tipo de exceção que não foi tratado acima
            System.out.println("Erro genérico: " + e.getMessage());

        } finally {
            // Bloco que sempre será executado, independentemente de uma exceção ter sido lançada ou não
            System.out.println("Bloco finally executado.");
        }
    }
}
