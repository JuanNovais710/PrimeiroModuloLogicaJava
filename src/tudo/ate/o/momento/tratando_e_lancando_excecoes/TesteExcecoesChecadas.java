package tratando_e_lancando_excecoes;

public class TesteExcecoesChecadas {
    public static void main(String[] args) {
        ContaCorrente conta2 = new ContaCorrente(100);

        try {
            conta2.sacar(60);
        }catch (SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo: " + conta2.getSaldo());

        try {
            conta2.sacar(50);
        }catch (SaldoInsuficienteException e) {
            System.out.println("Desculpe, saldo insuficiente.");
        }
        finally {
            System.out.println("Obrigado por utilizar nosso sistema. ");
        }
        System.out.println("Saldo agora: " + conta2.getSaldo());
    }
}
