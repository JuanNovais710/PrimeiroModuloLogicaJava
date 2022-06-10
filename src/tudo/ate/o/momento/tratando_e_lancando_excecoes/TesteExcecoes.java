package tratando_e_lancando_excecoes;

public class TesteExcecoes {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(5000d);
        try {
            conta1.depositar(-1000);
        }catch (IllegalArgumentException e) {
            System.out.println("Você executou uma operação ilegal: " + e.getMessage());
        }
    }
}
