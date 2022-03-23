package tudo.ate.o.momento;

import java.util.Scanner;

public class Exercicio04DescontoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorP = scanner.nextDouble();
        System.out.print("Quantidade do produto desejado: ");
        double quantidadeP = scanner.nextDouble();
        boolean semDesconto = quantidadeP < 10;

        double qtdDesconto = 0.00;

        double subTotal = valorP * quantidadeP;
        double desconto = valorP * quantidadeP * 10 / 100;
        double valorTotal = subTotal - desconto;

        if (!semDesconto) {
            System.out.println("Por levar mais de 10 produtos, receberá um desconto de 10% em sua compra!");
            System.out.println("Os produtos custariam: R$" + subTotal + ". Com seu desconto sairá por: R$" + valorTotal + "!");

        }else {
            System.out.println("Obrigado por comprar convosco. Seu pedido custa: R$" + subTotal);
        }

    }
}
