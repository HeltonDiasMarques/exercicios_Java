package nivel3_intermediario.fase2_introducao_a_arrays.exer2_soma_de_todos_os_elementos_de_um_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int num;
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Insira o número que deseja: ");
            num = scanner.nextInt();
            numeros.add(num);
        }

        for (int i = 0; i < numeros.size(); i++) {
            soma = soma + numeros.get(i);
        }

        System.out.println("O resultado da soma dos números é: " + soma);
    }
}