package tudo.ate.o.momento;

import java.util.Scanner;

public class AlterandoValorVariavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.println("Digite o tipo de pagamento: \n1 à vista \n2 parcelado. ");
        Integer tipoPagamento = scanner.nextInt();

        boolean aVista = tipoPagamento.equals(1);

        double juros = 0.0;

        if (!aVista) {
            juros = 10.0;
        }
        double acrescimo = valorProduto * juros / 100;
        double valorTotal = acrescimo + valorProduto;

        System.out.println("O valor total do produto é: " + valorTotal);

    }
}
