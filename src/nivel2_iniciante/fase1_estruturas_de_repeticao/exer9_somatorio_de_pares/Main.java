package nivel2_iniciante.fase1_estruturas_de_repeticao.exer9_somatorio_de_pares;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int inicio;
        int sum = 0;
        int aux = 0;
        int fim;

        System.out.println();
        inicio = scanner.nextInt();
        System.out.println();
        fim = scanner.nextInt();

        sum = inicio;
        aux = inicio + 2;
        if((inicio%2==0)&&(fim%2==0)){
            while(aux <= fim){
                sum += aux;
                aux += 2;
            }
        }else{
            System.out.println("O número precisa ser par.");
        }
        System.out.println("O resultado da soma dos números pares neste intervalo é " + sum);
    }
}
