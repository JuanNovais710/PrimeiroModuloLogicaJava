package com.company;

/*
Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência,
depois verifique se ela pode aposentar ou não.
Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos.
Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
 */

import java.util.Scanner;

public class Exercicio05 {
    static final Integer Idade_Minima_Para_Aposentar = 55;
    static final Integer Contribuicao_Minima_Para_Aposentar = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Programa previdência social\nInforme seu nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.printf("Olá %s! Por favor informe a sua idade: ", nomeUsuario);
        int idadeUsuario = scanner.nextInt();
        System.out.print("E quantos anos você possui de contribuição para a previdência? ");
        int tempoDeContruibuicao = scanner.nextInt();
        boolean idadeParaSeAposentar = idadeUsuario >= Idade_Minima_Para_Aposentar;
        boolean contribuicaoParaSeAposentar = tempoDeContruibuicao >= Contribuicao_Minima_Para_Aposentar;
        boolean aprovado = idadeParaSeAposentar && contribuicaoParaSeAposentar;

        if (aprovado) {
            System.out.printf("Parabéns, %s! por ter mais de 55 anos de idade, e 25 de contribuição, poderá se aposentar! ", nomeUsuario);
        } else {
            System.out.printf("%s, você deve ter no mínimo 55 anos de idade, e 25 de contribuição, para que possa se aposentar! ", nomeUsuario);
        }
    }
}
