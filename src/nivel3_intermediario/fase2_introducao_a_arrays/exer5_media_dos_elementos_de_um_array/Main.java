package nivel3_intermediario.fase2_introducao_a_arrays.exer5_media_dos_elementos_de_um_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        String input;
        double nota = 0, media;
        int contador = 0;

        while(true){
            System.out.print("Insira a nota do aluno(ou apenas aperte Enter para finalizar): ");
            input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            contador++;
            nota = Double.parseDouble(input);
            notas.add(nota);
        }

        for(Double atual : notas){
            nota = nota + atual;
        }


        media = nota / contador;

        System.out.println("A media é: "+ media);
    }
}
