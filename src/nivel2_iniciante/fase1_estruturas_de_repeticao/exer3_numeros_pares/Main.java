package nivel2_iniciante.fase1_estruturas_de_repeticao.exer3_numeros_pares;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int initial;
        int limit;

        System.out.println("Insira o inicio da contagem: ");
        initial = scanner.nextInt();
        System.out.println("Insira o final da contagem: ");
        limit = scanner.nextInt();

        if((initial%2==0)&&(limit%2==0)){
            while(initial<=limit){
                System.out.println(initial);
                initial = initial +2;
            }
        }else{
            System.out.println("Insira um número par.");
        }
    }
}
