package nivel3_intermediario.fase3_listas_e_colecoes.exer4_criacao_de_um_sistema_de_cadastro_de_alunos_usando_listas.model;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome,
                  int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome (){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                '}';
    }
}
