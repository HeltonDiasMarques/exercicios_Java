package nivel3_intermediario.fase3_listas_e_colecoes.exer5_uso_de_hashmap_para_armazenar_dados_de_produtos_com_preço;

import nivel3_intermediario.fase3_listas_e_colecoes.exer5_uso_de_hashmap_para_armazenar_dados_de_produtos_com_preço.model.Produto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, Produto> produtos = new HashMap<>();

        System.out.print("Insira o nome do produto: ");
        String nome = scanner.next();

        System.out.print("Insira o preço do produto: ");
        float preco = scanner.nextFloat();

        produtos.put(nome, new Produto(nome, preco));
        System.out.println(produtos.get(nome));
    }
}
