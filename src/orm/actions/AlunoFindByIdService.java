package orm.actions;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoFindByIdService {
    public Aluno buscarAlunoPorId(Long id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        Aluno aluno = manager.find(Aluno.class, id);

        manager.close();
        factory.close();

        return aluno;
    }
}
