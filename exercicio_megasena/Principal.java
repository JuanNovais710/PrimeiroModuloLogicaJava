package com.company.exercicio_megasena;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos jogos deseja fazer? ");
        int numeroEntradas = scanner.nextInt();
        quebraLinha();
        for(int i = 1; i<= numeroEntradas; i++) {
            Megasena sorteio = new Megasena();
            sorteio.sortear();
            sorteio.exibirNumeros();
            quebraLinha();
        }
    }
    public static void quebraLinha() {
        System.out.println("------------------------");
    }
}
