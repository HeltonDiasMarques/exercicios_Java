package nivel2_iniciante.fase3_matrizes_sem_array.exer4_multiplicacao_de_duas_matrizes;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int [][] matriz1 = {{1, 2, 3, 4, 5},
                            {6, 7, 8, 9, 10}};

        int [][] matriz2 = {{6, 7, 8, 9, 10},
                            {1, 2, 3, 4, 5}};

        int [][] matriz3 = {{},{}};

        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j< matriz1.length; j++){
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.println(matriz3[i][j]);
            }
        }
    }
}
