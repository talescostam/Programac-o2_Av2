package app;

import orm.actions.AlunoFindByInitialService;

import java.util.Scanner;

public class TestaBuscaPorLetraInicial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a letra inicial dos nomes que deseja buscar: ");
        char letraInicial = scanner.nextLine().charAt(0);

        AlunoFindByInitialService busca = new AlunoFindByInitialService();
        busca.buscarAlunosPorLetraInicial(letraInicial);
    }
}
