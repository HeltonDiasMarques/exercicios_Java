package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer8_criacao_de_um_sistema_de_cadastro_de_clientes_simples;

public class Clientes {
    String nome;
    String email;

    public Clientes(String nome,
                    String email){
        this.nome = nome;
        this.email = email;
    }

    public String nome(){
        return nome;
    }
    public String email(){
        return email;
    }
}
