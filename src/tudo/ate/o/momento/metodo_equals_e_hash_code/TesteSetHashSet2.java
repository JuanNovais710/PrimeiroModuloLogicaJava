package metodo_equals_e_hash_code;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet2 {
    public static void main(String[] args) {
        Set<Aluno> alunos = SimuladorBancoDeDados.buscarAluno();

        //Simulação de sorteio
        Aluno alunoSorteado = new Aluno("Maria");

        //Só consegue usar contains na classe aluno, se a classe
        //tiver o objeto Equals and hash code sobrescrito.
        if(alunos.contains(alunoSorteado)) {
            System.out.println("Parabéns " + alunoSorteado.getNome());
        }else {
            System.out.println("Aluno não cadastrado no banco de dados.");
        }
    }
}
