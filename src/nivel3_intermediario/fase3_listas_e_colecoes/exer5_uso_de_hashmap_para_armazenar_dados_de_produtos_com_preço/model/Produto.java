package nivel3_intermediario.fase3_listas_e_colecoes.exer5_uso_de_hashmap_para_armazenar_dados_de_produtos_com_preço.model;

public class Produto {
    private String nome;
    private float preco;

    public Produto(String nome,
                   float preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String toString(){
        return "Produto {\n" +
                "   nome = " + getNome() + ",\n" +
                "   preco = " +  String.format("%.2f", getPreco()) +
                "\n}";
    }
}
