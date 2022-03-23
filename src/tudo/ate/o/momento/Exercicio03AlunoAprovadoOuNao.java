package tudo.ate.o.momento;

import java.util.Scanner;

public class Exercicio03AlunoAprovadoOuNao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("De 0 a 100, qual foi a nota do aluno? ");
        double notaAluno = scanner.nextDouble();
        boolean aprovado = notaAluno >= 70;

        if (aprovado) {
            System.out.println("Parabéns sua nota foi: " + notaAluno + ". Você está aprovado!");
        } else {
            System.out.println("Esforce-se mais. Sua nota foi: " + notaAluno + ". Você está reprovado.");
        } scanner.close();
    }
}
