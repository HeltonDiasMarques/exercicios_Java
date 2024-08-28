package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer3_criacao_de_construtores_e_metodos_getters_e_setters;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
}
