package nivel1_iniciante_absoluto.fase4_estruturas_condicionais.exer7_numero_par_ou_impar;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        boolean par = false;

        System.out.println("Insira o número que deseja verificar: ");
        num = scanner.nextInt();

        if (num == 0) {
            if(num%2==0){
                par = true;
            }
            System.out.println(par);
        }else{
            System.out.println("0 é um número neutro, insira outro.");
        }
    }
}
