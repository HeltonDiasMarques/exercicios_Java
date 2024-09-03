package nivel3_intermediario.fase3_listas_e_colecoes.exer3_ordenacao_de_uma_lista_de_strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> nomes = new ArrayList<>();

        nomes.add("B");
        nomes.add("D");
        nomes.add("C");
        nomes.add("A");

        Collections.sort(nomes);

        for(String atual : nomes){
            System.out.print(atual);
        }
    }
}