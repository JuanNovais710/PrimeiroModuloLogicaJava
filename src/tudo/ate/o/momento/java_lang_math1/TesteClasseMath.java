package com.company.java_lang_math1;

import static java.lang.Math.*;

public class TesteClasseMath {
    public static void main(String[] args) {
        int raio = 4;
        double comprimento = 2 * raio * PI; //PI importado por java lang math.
        System.out.println("Comprimento: " + comprimento);

        double[] precosProdutosA = {30.20, 25.49};
        double maiorPreco =  max(precosProdutosA[0], precosProdutosA[1]);
        System.out.println("Maior preço: " + maiorPreco);
        System.out.println("Menor preço: " + min(precosProdutosA[0], precosProdutosA[1]));

        //Potência
        System.out.println("2³: " + Math.pow(2,3));

        //Raiz quadrada
        System.out.println("Raiz de 9: " + Math.sqrt(9));

        //Arredondamento cell, floor e round
        double n = 5.4;
        System.out.println("Menor inteiro: " + Math.floor(n));
        System.out.println("Maior inteiro: " + Math.ceil(n));
        System.out.println("Arredondamento: " + Math.round(n));

        //Numero aleatorio:
        double numeroALeatorio = Math.random() * 100;
        System.out.println(numeroALeatorio);
    }
}
