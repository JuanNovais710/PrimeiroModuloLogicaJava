package trabalhando_com_numeros.desafio;
/*
Desenvolva um programa que:
Recebe como parâmetro do usuário o valor de um produto do tipo double.
Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele.
Calcula 10% do valor usando os métodos disponíveis na classe BigDecimal.
Formata o novo valor calculado para o padrão monetário (R$).
Exibe na tela o valor calculado e formatado.
 */

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.print("Informe um valor em reais: ");
        Scanner scanner = new Scanner(System.in);
        double valorUsuario = scanner.nextDouble();
        BigDecimal bg = new BigDecimal(valorUsuario);
        BigDecimal dezPorCentoValorUsuario = bg.divide(BigDecimal.TEN);
        System.out.println(dezPorCentoValorUsuario);
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
        System.out.println(formatador.format(dezPorCentoValorUsuario));
    }
}
