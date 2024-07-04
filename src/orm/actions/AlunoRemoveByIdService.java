package orm.actions;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoRemoveByIdService {
    public void removerAlunoPorId(Long id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        Aluno aluno = new Aluno();
        aluno.setId(id);
        aluno = manager.find(Aluno.class, aluno.getId());

        manager.getTransaction().begin();
        manager.remove(aluno);
        manager.getTransaction().commit();
        System.out.println("Aluno(a) excluído(a): " + aluno.getNome() + " com ID: " + aluno.getId());

        manager.close();
        factory.close();
    }
}
