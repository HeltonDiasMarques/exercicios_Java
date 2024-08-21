package nivel1_iniciante_absoluto.fase5_operadores_logicos_e_relacionais.exer9_operadores_relacionais_e_logicos_em_decisoes_simples;

public class Main {
    public static void main(String [] args){
        //Operadores Lógicos
            //AND Lógico (&&)
                boolean resultado1 = (5 > 3) && (8 > 6);//true, pois ambas as condições são verdadeiras;
            //OR Lógico(||)
                boolean resultado2 = (5 > 3) || (8 > 6);//true, pois ambas as condições é verdadeiras;
            //NOT Lógico(!)
                boolean resultado3 = !(5 > 3);//false, pois 5 é maior que 3 e o operador NOT inverte o valor;
            //XOR Lógico(^)
                boolean resultado4 = (5 > 3) ^ (8 > 6);//false, pois ambas as condições são verdadeiras;
        //Operadores relacionais
            //Maior que(>)
                boolean resultado5 = 10 > 5;//true
            //Menor que(<)
                boolean resultado6 = 5 < 10;//true
            //Maior ou igual a (>=)
                boolean resultado7 = 10 >= 10;//true
            //Menor ou igual a (<=)
                boolean resultado8 = 5 <= 10;//true
            //Igual a (==)
                boolean resultado9 = 5 == 5;//true
            //Diferente de (!=)
                boolean resultado10 = 5 != 10;//true

        //Resumo
            //Operadores Lógicos:
                /*Usadas para combinar ou inverter expressões booleanas(falso ou verdadeiro)*/
            //Operadores Relacionais:
                /*Usados para comparar dois valores e retornar uma expressão booleana(falso ou verdadeiro)
                * Eles são de extrema importancia para estruturas como While, If e For, que veremos mais para frente*/
    }
}
