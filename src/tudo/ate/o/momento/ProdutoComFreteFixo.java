package tudo.ate.o.momento;

import java.util.Scanner;

public class ProdutoComFreteFixo {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Qual o preço do produto? ");
            Double preçoP = teclado.nextDouble();
            Double preçoF = 2.00;
            Double preçoT;
            preçoT = preçoP + preçoF;
            System.out.println("O preço do produto é: R$" + preçoP + ". Com o frete de R$" + preçoF + ", o total a ser pago é de: R$" + preçoT);
        }
    }
