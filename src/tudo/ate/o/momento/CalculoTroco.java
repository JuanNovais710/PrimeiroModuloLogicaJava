package tudo.ate.o.momento;

import java.util.Scanner;

public class CalculoTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.print("Digite o valor passado pelo cliente: ");
        Double valorCliente = scanner.nextDouble();
        double troco = valorCliente - valorProduto;
        if(valorCliente < valorProduto) {
            System.out.println("A quantia entregue é menor que o valor do produto.");
        } else {
            System.out.println("A quantia a ser devolvida é: " + troco);
        }
        scanner.close();

    }
}
