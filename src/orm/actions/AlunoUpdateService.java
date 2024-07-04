package orm.actions;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoUpdateService {
    public void AtualizarDadosDoAluno(Aluno aluno) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.merge(aluno);
        manager.getTransaction().commit();

        System.out.println("Dados do aluno " + aluno.getNome() + " atualizados, ID: " + aluno.getId());

        manager.close();
        factory.close();
    }
}
