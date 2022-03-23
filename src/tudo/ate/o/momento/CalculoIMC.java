package tudo.ate.o.momento;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cálculo IMC: ");
        System.out.print("Digite seu peso em KG: ");
        Double pesoK = scanner.nextDouble();
        System.out.print("Digite sua altura em M: ");
        Double alturaP = scanner.nextDouble();
        Double alturaQ = alturaP * alturaP;
        Double IMC = pesoK / alturaQ;
        System.out.println("Seu Índice de Massa Corporal é: " + IMC);
        scanner.close();
    }
}

