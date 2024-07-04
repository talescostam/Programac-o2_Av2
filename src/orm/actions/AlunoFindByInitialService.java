package orm.actions;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class AlunoFindByInitialService {
    public void buscarAlunosPorLetraInicial(char letraInicial) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        TypedQuery<Aluno> query = manager.createQuery(
                "SELECT a FROM Aluno a WHERE a.nome LIKE :letraInicial", Aluno.class);
        query.setParameter("letraInicial", letraInicial + "%");
        List<Aluno> alunos = query.getResultList();

        manager.close();
        factory.close();

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno encontrado que inicie com a letra '" + letraInicial + "'.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("ID: " + aluno.getId());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Email: " + aluno.getEmail());
                System.out.println("CPF: " + aluno.getCPF());
                System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
                System.out.println("Naturalidade: " + aluno.getNaturalidade());
                System.out.println("Endereço: " + aluno.getEndereco());
                System.out.println("---------------");
            }
        }
    }
}
