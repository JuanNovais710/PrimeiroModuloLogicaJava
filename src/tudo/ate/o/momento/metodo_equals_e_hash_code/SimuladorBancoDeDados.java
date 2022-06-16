package metodo_equals_e_hash_code;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {

    public static Set<Aluno> buscarAluno() {
        Set<Aluno> alunos = new HashSet<>();
        alunos.add(new Aluno("Ricardo"));
        alunos.add(new Aluno("João"));
        alunos.add(new Aluno("Maria"));
        return alunos;
    }
}
