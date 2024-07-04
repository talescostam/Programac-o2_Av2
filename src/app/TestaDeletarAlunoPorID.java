package app;

import orm.actions.AlunoRemoveByIdService;

import java.util.Scanner;

public class TestaDeletarAlunoPorID {
    public static void main(String[] args) {
        System.out.println("Qual aluno você quer excluir? ");
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();

        AlunoRemoveByIdService alunoRemoveByIdService = new AlunoRemoveByIdService();
        alunoRemoveByIdService.removerAlunoPorId(id);
    }
}
