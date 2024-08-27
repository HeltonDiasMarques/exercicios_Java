package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer1_criacao_de_classe_com_atributos_e_metodos;

public class Item {
    // Atributo da classe
    String nome;

    // Método para definir o nome do item
    public void definirNome(String novoNome) {
        nome = novoNome;
    }

    // Método para exibir o nome do item
    public void mostrarNome() {
        System.out.println("Nome do item: " + nome);
    }
}