package app;

import orm.actions.AlunoInsertService;
import orm.model.Aluno;

import java.util.Scanner;

public class TestaInserirAluno {
    public static void main(String[] args) {
        System.out.println("Vamos cadastrar um aluno!");
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome do aluno? ");
        aluno.setNome(scanner.nextLine());

        System.out.println("Qual é o e-mail do aluno? ");
        aluno.setEmail(scanner.nextLine());

        System.out.println("Qual é o CPF do aluno? ");
        aluno.setCPF(scanner.nextLine());

        System.out.println("Qual é a naturalidade do aluno? ");
        aluno.setNaturalidade(scanner.nextLine());

        System.out.println("Qual é o endereço do aluno? ");
        aluno.setEndereco(scanner.nextLine());

        System.out.println("Qual é a data de nascimento do aluno? ");
        aluno.setDataNascimento(scanner.nextLine());

        AlunoInsertService alunoInsertService = new AlunoInsertService();
        alunoInsertService.adicionarAluno(aluno);
    }
}
