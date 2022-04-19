package com.company;

import java.util.Scanner;

public class Exercicio01Metodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};
        System.out.println("Escolha dentre os cursos abaixo: ");
        iterarVetor(cursos);

        System.out.print("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
        if (!posicaoValida) {
            posicaoInvalida();
        }
        imprimirTraco();
        String[] formasPagamento = new String[]{"Cartão", "Boleto"};
        imprimir("Escolha dentre as formas de pagamento abaixo: ");
        iterarVetor(formasPagamento);

        imprimir("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
        posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;
        if (!posicaoValida) {
            posicaoInvalida();
        }
        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
        imprimirTraco();
        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
        scanner.close();
    }

    static void imprimirTraco() {
        String padraoTraco = "------------------------------------------------";
        System.out.println(padraoTraco);
    }

    static void posicaoInvalida() {
        System.err.println("Posição inválida! ");
        System.exit(1);
    }

    static void iterarVetor(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            imprimir("[" + i + "] " + vetor[i]);
        }
    }
    static void imprimir(String texto) {
        System.out.println(texto);
    }
}

