package collections_framework;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {
    public static void main(String[] args) {
        //Mesma coisa que o list porém não permite que os elementos sejam repetidos.
        Aluno a1 = new Aluno("Juan", 20);
        Aluno a2 = new Aluno("Maria", 15);
        Aluno a3 = new Aluno("John", 17);
        Aluno a4 = new Aluno("Sapo", 22);

        Set<Aluno> alunos = new HashSet<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);

        imprimirAlunos(alunos);
    }
    public static void imprimirAlunos(Set<Aluno> alunos) {
        for (Aluno a : alunos) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
