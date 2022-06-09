package com.company.java_lang_math1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MEGASENA");
        exibirTracos();
        System.out.print("Quantos jogos deseja fazer? ");
        int quantidadeDejogos = scanner.nextInt();
        for(int i = 1; i <= quantidadeDejogos; i++) {
            Megasena megasena = new Megasena();
            megasena.sortearNumeros();
            megasena.exibirNumeros();
            exibirTracos();
        }

    }
    static void exibirTracos() {
        System.out.println("---------------------");
    }
}
