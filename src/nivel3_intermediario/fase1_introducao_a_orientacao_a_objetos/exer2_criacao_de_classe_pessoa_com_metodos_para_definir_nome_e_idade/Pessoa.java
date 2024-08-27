package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer2_criacao_de_classe_pessoa_com_metodos_para_definir_nome_e_idade;

public class Pessoa {
    // Atributos da classe
    String nome;
    int idade;

    public void definirNomeEIdade(String novoNome, int novaIdade){
        nome = novoNome;
        idade = novaIdade;
    }

    // Método para apresentar a pessoa
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.");
    }
}