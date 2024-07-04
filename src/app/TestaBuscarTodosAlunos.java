package app;

import orm.actions.AlunoFindAllService;

public class TestaBuscarTodosAlunos {
    public static void main(String[] args) {
        AlunoFindAllService busca = new AlunoFindAllService();
        busca.imprimirAlunos();
    }
}
