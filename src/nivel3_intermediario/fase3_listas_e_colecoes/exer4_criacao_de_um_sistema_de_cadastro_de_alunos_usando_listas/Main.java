package nivel3_intermediario.fase3_listas_e_colecoes.exer4_criacao_de_um_sistema_de_cadastro_de_alunos_usando_listas;

import nivel3_intermediario.fase3_listas_e_colecoes.exer4_criacao_de_um_sistema_de_cadastro_de_alunos_usando_listas.model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();

        System.out.print("Insira o nome do aluno: ");
        String nome = scanner.next();

        System.out.print("Insira a idade do aluno: ");
        int idade = scanner.nextInt();

        Aluno aluno = new Aluno(nome, idade);
        alunos.add(aluno);

        for(Aluno atual : alunos){
            System.out.println(atual);
        }
    }
}
