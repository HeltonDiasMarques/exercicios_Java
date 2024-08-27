package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer4_criacao_de_metodo_para_calcular_a_idade_baseada_no_ano_de_nascimento;

public class Validador{
    public int descobrir(int ano, int idade1){
        while(ano < 2024){
            ano ++;
            idade1 ++;
        }
      return idade1;
    }
}
