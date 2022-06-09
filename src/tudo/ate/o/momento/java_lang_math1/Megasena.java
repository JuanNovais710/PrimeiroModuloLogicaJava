package com.company.java_lang_math1;

/*
A Mega-Sena é o jogo que paga milhões de reais para o acertador dos números sorteados.
Em um jogo comum, os jogadores devem marcar 6 números entre os 60 disponíveis, sendo de 1 a 60.
Na empresa que você trabalha, o pessoal se juntou para fazer um bolão. Um bolão acontece quando várias pessoas se unem para jogarem várias combinações de números em conjunto.
Se algum jogo for contemplado, o valor do prêmio é dividido entre todos os participantes.
Como um bom programador, você sugeriu e se dispôs a desenvolver um pequeno software para gerar os números a serem marcados nos jogos. Todos concordaram,
 agora você tem um importante trabalho pela frente.
Faça um programa em Java que recebe como parâmetro do usuário a quantidade de jogos a serem feitos, gera e exibe na tela a sequência de números de cada jogo.
Use a classe Math para gerar números aleatórios e fazer arredondamentos. Lembre-se de verificar se não existem números repetidos em uma sequência, pois os 6 números devem ser únicos.
Se levar esse desafio a sério, jogar na Mega-Sena e ganhar, não esqueça de nós! ;)
 */

import java.util.Scanner;

public class Megasena {
    private static final int NUMERO_POR_JOGO = 6;
    private static final int NUMERO_MAXIMO = 60;
    int[] numerosSorteados;

    public void sortearNumeros() {
        numerosSorteados = new int[NUMERO_POR_JOGO];
            for (int i = 1; i <= NUMERO_POR_JOGO; i++) {
                int numeroSorteado = (int) Math.round(Math.random() * NUMERO_MAXIMO);
                if (!numeroJaSorteado(numeroSorteado) && numeroSorteado != 0) {
                    numerosSorteados[i - 1] = numeroSorteado;
                }else {
                    i--;
                }
            }
    }
    public void exibirNumeros() {
        for(int numeroSorteado : numerosSorteados) {
            System.out.println(numeroSorteado);
        }
    }

    private boolean numeroJaSorteado(int numero) {
        boolean resultado = false;
        for(int i = 0; i < numerosSorteados.length; i++) {
            if(numerosSorteados[i] == numero) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

}
