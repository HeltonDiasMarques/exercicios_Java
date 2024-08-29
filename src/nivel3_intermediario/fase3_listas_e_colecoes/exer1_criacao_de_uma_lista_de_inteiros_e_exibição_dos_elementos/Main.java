package nivel3_intermediario.fase3_listas_e_colecoes.exer1_criacao_de_uma_lista_de_inteiros_e_exibição_dos_elementos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for(Integer numero : numeros){
            System.out.println(numero);
        }
    }
}
