package nivel2_iniciante.fase3_matrizes_sem_array.exer2_acesso_a_matriz;

public class Main {
    public static void  main(String [] args){
        int [][] matriz = {{1, 2, 3, 4, 5},
                           {6, 7, 8, 9, 10}};

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.println(matriz);
            }
        }
    }
}
