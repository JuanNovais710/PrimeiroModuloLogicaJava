package tudo.ate.o.momento;

import java.util.Scanner;

public class NomeSobrenome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apresente seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Apresente seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Seu nome completo é: " + name + " " + sobrenome);

    }
}