package com.company;
/*
Crie uma pequena calculadora de subtração e adição.
Crie um programa que peça dois números do usuário e também qual a operação ele deseja fazer - adição ou subtração.
Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição,
que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração.
Fique a vontade para implementar multiplicação e divisão também.
 */

import java.util.Scanner;

public class Exercicio03MetodosCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer tipoDeOperacao = receberOperacao("Qual o tipo de operação que deseja realizar?\n(1): Adição\t(2): Subtação", scanner);
        Boolean operacaoEValida = operacaoValida(tipoDeOperacao);
        if(operacaoEValida) {
            if(tipoDeOperacao == 1) {
                imprimirTexto("Informe o primeiro número que deseja somar: ");
                Integer primeiroNumero = scanner.nextInt();
                imprimirTexto("Informe o segundo número que deseja realizar a soma: ");
                Integer segundoNumero = scanner.nextInt();
                Integer resultadoDaSoma = adicao(primeiroNumero, segundoNumero);
            }
            else if(tipoDeOperacao == 2) {
                imprimirTexto("Informe o primeiro número que deseja subtrair: ");
                Integer primeiroNumero = scanner.nextInt();
                imprimirTexto("Informe o segundo número que deseja realizar a subtração: ");
                Integer segundoNumero = scanner.nextInt();
                Integer resultadoDaSubtracao = subtracao(primeiroNumero, segundoNumero);
            }
        }else {
            posicaoInvalida();
        }
    }
    static Integer receberOperacao(String texto, Scanner scanner) {
        imprimirTexto(texto);
        Integer sinalOperador = scanner.nextInt();
        return sinalOperador;
    }
    static Boolean operacaoValida(Integer numeroDigitado){
        Boolean validarOperacao = numeroDigitado == 1 || numeroDigitado == 2;
        return validarOperacao;
    }
    static Integer adicao(Integer primeiroNumero, Integer segundoNumero) {
        int resultadoAdicao = primeiroNumero + segundoNumero;
        imprimirTexto("O resultado de " + primeiroNumero + " + " + segundoNumero + " é: " + resultadoAdicao);
        return resultadoAdicao;
    }
    static Integer subtracao(Integer primeiroNumero, Integer segundoNumero) {
        int resultadoSubtracao = primeiroNumero - segundoNumero;
        imprimirTexto("O resultado de " + primeiroNumero + " - " + segundoNumero + " é: " + resultadoSubtracao);
        return resultadoSubtracao;
    }

    static void imprimirTexto(String texto) {
        System.out.println(texto);
    }
    static void posicaoInvalida() {
        System.err.println("A operação é inválida. ");
        System.exit(1);
    }
}
