package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer7_criacao_de_classe_produto_com_metodos_para_aplicar_desconto;

public class Desconto {
    protected double desconto(double valor){
        double [] descontos = {0.05, 0.1, 0.5};
        double [] faixas = {100.00, 200.00, 1000.00};

        for(int i = 0; i < descontos.length; i++){
            if(valor < faixas[i]){
                return valor - (valor * descontos[i]);
            }
        }
        return 0;
    }
}
