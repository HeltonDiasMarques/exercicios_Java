package nivel2_iniciante.fase3_matrizes_sem_array.exer5_transposicao;

public class Main {
    public static void main(String [] args){
        int [][] matriz1 = {{1, 2, 3, 4, 5},
                            {6, 7, 8, 9, 10}};
        int [][] matriz2 = {{0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0}};

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz2[i][j] = matriz1[i][j];
                System.out.println(matriz2[i][j]);
            }
        }
    }
}
