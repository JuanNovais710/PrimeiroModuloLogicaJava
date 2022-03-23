package tudo.ate.o.momento;

import java.util.Scanner;

public class QuadradoDoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        Integer numeroI = scanner.nextInt();
        Integer quadradoN = numeroI * numeroI;
        System.out.println("O quadrado do número " + numeroI + " é: " + quadradoN);
        scanner.close();
    }
}
