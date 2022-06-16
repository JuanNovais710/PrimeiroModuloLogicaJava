package collections_framework;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Juan", 20);
        Aluno a2 = new Aluno("Maria", 15);
        Aluno a3 = new Aluno("John", 17);
        Aluno a4 = new Aluno("Sapo", 22);

        Map<String, Aluno> alunos = new HashMap<>();
        alunos.put("Aluno 1: ", a1);
        alunos.put("Aluno 2: ", a2);
        alunos.put("Aluno 3: ", a3);
        alunos.put("Aluno 4: ", a4);
        alunos.put("Aluno 4.: ", a4);
        imprimirAlunos(alunos);

        Aluno alunoRecuperado = alunos.get("3");
        System.out.println("Aluno de chave 3: " + alunoRecuperado.getNome());
    }

    public static void imprimirAlunos(Map<String, Aluno> alunos) {
        for (Aluno a : alunos.values()) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
