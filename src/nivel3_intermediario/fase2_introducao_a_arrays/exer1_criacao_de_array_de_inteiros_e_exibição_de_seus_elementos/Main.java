package nivel3_intermediario.fase2_introducao_a_arrays.exer1_criacao_de_array_de_inteiros_e_exibição_de_seus_elementos;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<String> array = new ArrayList<>();

        array.add("Maça");
        array.add("Laranja");
        array.add("Uva");

        System.out.print("\nLista de frutas:\n");
        for(String fruta : array){
            System.out.println(fruta);
        }
    }
}
