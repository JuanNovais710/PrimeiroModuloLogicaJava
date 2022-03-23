package tudo.ate.o.momento;

import java.util.Scanner;

public class HabilitacaoMaiorQue18Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a idade do candidato? ");
        int idadePessoa = scanner.nextInt();
        boolean habilitado = idadePessoa >= 18;

        if (habilitado) {
            System.out.println("O candidato está habilitado a tirar sua carteira! ");
        } else  {
            System.out.println("O candidato não está habilitado a tirar carteira! ");
        }
        scanner.close();
    }
}
