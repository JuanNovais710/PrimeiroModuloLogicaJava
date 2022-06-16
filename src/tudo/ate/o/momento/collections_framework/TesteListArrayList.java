package collections_framework;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Juan", 20);
        Aluno a2 = new Aluno("Maria", 15);
        Aluno a3 = new Aluno("John", 17);
        Aluno a4 = new Aluno("Sapo", 22);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a4);

        imprimirAlunos(alunos);
    }
    public static void imprimirAlunos(List<Aluno> alunos) {
        for(Aluno a : alunos) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
