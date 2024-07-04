package app;

import orm.actions.AlunoUpdateService;
import orm.actions.AlunoFindByIdService;
import orm.model.Aluno;

import java.util.Scanner;

public class TestaAtualizarDadosDoAluno {
    public static void main(String[] args) {
        System.out.println("Vamos atualizar um aluno!");
        Scanner scanner = new Scanner(System.in);
        AlunoFindByIdService alunoFindByIdService = new AlunoFindByIdService();
        AlunoUpdateService alunoUpdateService = new AlunoUpdateService();

        System.out.println("Qual é o id do(a) aluno(a)?");
        Aluno aluno = alunoFindByIdService.buscarAlunoPorId(scanner.nextLong());

        String nomeAtual = aluno.getNome();
        String emailAtual = aluno.getEmail();
        String cpfAtual = aluno.getCPF();
        String dataDeNascimentoAtual = aluno.getDataNascimento();
        String naturalidadeAtual = aluno.getNaturalidade();
        String enderecoAtual = aluno.getEndereco();

        System.out.println("Nome atual: " + nomeAtual);
        scanner.nextLine();
        System.out.print("Novo nome (deixe em branco para manter): ");
        String novoNome = scanner.nextLine();
        if (novoNome.isEmpty()) {
            novoNome = aluno.getNome();
        }

        System.out.println("Email atual: " + emailAtual);
        System.out.print("Novo email (deixe em branco para manter): ");
        String novoEmail = scanner.nextLine();
        if (novoEmail.isEmpty()) {
            novoEmail = emailAtual;
        }

        System.out.println("CPF atual: " + cpfAtual);
        System.out.print("Novo cpf (deixe em branco para manter): ");
        String novoCPF = scanner.nextLine();
        if (novoCPF.isEmpty()) {
            novoCPF = cpfAtual;
        }

        System.out.println("Data De nascimento atual: " + dataDeNascimentoAtual);
        System.out.print("Nova data de nascimento (deixe em branco para manter): ");
        String novaData = scanner.nextLine();
        if (novaData.isEmpty()) {
            novaData = dataDeNascimentoAtual;
        }

        System.out.println("Naturalidade atual: " + naturalidadeAtual);
        System.out.print("Nova naturalidade (deixe em branco para manter): ");
        String novaNaturalidade = scanner.nextLine();
        if (novaNaturalidade.isEmpty()) {
            novaNaturalidade = naturalidadeAtual;
        }

        System.out.println("Endereço atual: " + enderecoAtual);
        System.out.print("Novo endereço (deixe em branco para manter): ");
        String novoEndereco = scanner.nextLine();
        if (novoEndereco.isEmpty()) {
            novoEndereco = enderecoAtual;
        }

        Aluno novoAluno = new Aluno();
        novoAluno.setId(aluno.getId());
        novoAluno.setNome(novoNome);
        novoAluno.setEmail(novoEmail);
        novoAluno.setCPF(novoCPF);
        novoAluno.setDataNascimento(novaData);
        novoAluno.setNaturalidade(novaNaturalidade);
        novoAluno.setEndereco(novoEndereco);

        alunoUpdateService.AtualizarDadosDoAluno(novoAluno);

    }
}
