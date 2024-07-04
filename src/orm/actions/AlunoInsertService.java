package orm.actions;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoInsertService {

    public void adicionarAluno(Aluno aluno) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(aluno);
        manager.getTransaction().commit();

        System.out.println("Aluno" + aluno.getNome() + "inserido com o ID: " + aluno.getId());

        manager.close();
        factory.close();
    }
}
