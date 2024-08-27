package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer1_criacao_de_classe_com_atributos_e_metodos;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        Item item1 = new Item();

        item1.definirNome("Cadeira");

        item1.mostrarNome();
    }
}
