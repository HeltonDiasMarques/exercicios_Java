package nivel2_iniciante.fase4_funcoes_e_metodos.exer4_5_funcao_recursiva_exemplo;

public class Exemplo {
    public static void main(String[] args) {
        // Começa no degrau 5
        descerEscada(5);
    }

    public static void descerEscada(int degrau) {
        // Caso base: Se estiver no último degrau, pare
        if (degrau == 0) {
            System.out.println("Cheguei ao chão!");
        } else {
            // Ação: Desce um degrau
            System.out.println("Estou no degrau: " + degrau);
            // Chamada recursiva: Desce o próximo degrau
            descerEscada(degrau - 1);
        }
    }
}
