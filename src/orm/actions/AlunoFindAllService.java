package orm.actions;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class AlunoFindAllService {
    public void imprimirAlunos() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alunos");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        List<Aluno> alunos = entityManager.createQuery("SELECT a FROM Aluno a", Aluno.class).getResultList();

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno encontrado.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("ID: " + aluno.getId());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Email: " + aluno.getEmail());
                System.out.println("CPF: " + aluno.getCPF());
                System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
                System.out.println("Naturalidade: " + aluno.getNaturalidade());
                System.out.println("Endereço: " + aluno.getEndereco());
                System.out.println("=========================================");
            }
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();


    }
}
