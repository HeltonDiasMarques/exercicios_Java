package nivel2_iniciante.fase4_funcoes_e_metodos.exer4_funcao_recursiva_para_calcular_fatorial;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int fatorial, aux;
        int resultado;

        System.out.print("Insira o número que deseja saber o seu fatorial: ");
        aux = scanner.nextInt();

        fatorial = aux;
        resultado = recursivo(fatorial);

        System.out.print(aux + "! = "+ resultado);
    }

    public static int recursivo(int fatorial){
        if(fatorial == 1){
            return 1;
        }

        return fatorial * recursivo(fatorial - 1);
    }
}
