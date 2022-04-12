import java.util.Scanner;
/*
Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, caso a meta seja alcançada.
Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa para o ano que passou.
Depois, receba o parâmetro referente ao faturamento real da empresa no ultimo ano. Por último, receba a média salarial
do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial, já que estamos trabalhando com um
algoritmo fictício - na hora de informar esse parâmetro, invente um valor qualquer para representar essa média salarial).
Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários
ganharam um bônus que será igual a média salarial deles no último ano. Caso o faturamento seja menor que a meta, mas,
seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.
No final, mostre de quanto será o prêmio desse funcionário(a).
 */

public class Exercicio02IF {
    static final float oitentaPorCentoDaMeta = 0.8f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a meta de faturamento do último ano: ");
        double metaASerBatida = scanner.nextDouble();
        System.out.print("Agora informe o faturamento que a empresa atingiu: ");
        double faturamentoDaEmpresa = scanner.nextDouble();
        System.out.print("Qual foi a média salarial dos seus funcionários no último ano? ");
        double mediaSalarial = scanner.nextDouble();
        boolean empresaAtingiuAMeta = faturamentoDaEmpresa >= metaASerBatida;
        boolean atingiuOitentaPorCento = faturamentoDaEmpresa < metaASerBatida && faturamentoDaEmpresa >= metaASerBatida * oitentaPorCentoDaMeta;

        if (empresaAtingiuAMeta) {
            System.out.println("Por ter atingindo a meta estabelecida, os funcionários ganharão um prêmio no mês de janeiro equivalente a R$" + mediaSalarial);
        } else if (atingiuOitentaPorCento) {
            double oitentaPorCentoDoSalario = mediaSalarial * oitentaPorCentoDaMeta;
            System.out.printf("A empresa atingiu apenas 80 da meta, assim no mês de janeiro os funcionários serão bonificados em 80 do seu salário:R$ %.2f ", oitentaPorCentoDoSalario);
        } else {
            System.out.println("A meta anual não foi atingida. Não teremos bonificações esse ano. Esforcem-se mais. ");
        }
    }
}
