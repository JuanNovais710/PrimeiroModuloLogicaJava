import java.util.Scanner;

public class Exercicio03MetodosCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double primeiroNumeroRecebido = receberNumero(scanner);
        quebraLinha();
        Byte operadorEscolhidoPeloUsuario = receberOperacao(scanner);
        quebraLinha();
        Double segundoNumeroRecebido = receberNumero(scanner);
        switch (operadorEscolhidoPeloUsuario) {
            case 0 -> {
                char subtrair = '-';
                Double resultado = realizarCalculo(operadorEscolhidoPeloUsuario, primeiroNumeroRecebido, segundoNumeroRecebido);
                System.out.print(primeiroNumeroRecebido + " " + subtrair + " " + segundoNumeroRecebido + " = " + resultado);
            }case 1 -> {
                char adicionar = '+';
                Double resultado = realizarCalculo(operadorEscolhidoPeloUsuario, primeiroNumeroRecebido, segundoNumeroRecebido);
                System.out.print(primeiroNumeroRecebido + " " + adicionar + " " + segundoNumeroRecebido + " = " + resultado);
            }case 2 -> {
                char multiplicar = '*';
                Double resultado = realizarCalculo(operadorEscolhidoPeloUsuario, primeiroNumeroRecebido, segundoNumeroRecebido);
                System.out.print(primeiroNumeroRecebido + " " + multiplicar + " " + segundoNumeroRecebido + " = " + resultado);
            }case 3 -> {
                char dividir = '/';
                Double resultado = realizarCalculo(operadorEscolhidoPeloUsuario, primeiroNumeroRecebido, segundoNumeroRecebido);
                System.out.print(primeiroNumeroRecebido + " " + dividir + " " + segundoNumeroRecebido + " = " + resultado);
            }default -> {
                posicaoInvalida();
            }
        }
    }

    static Double receberNumero(Scanner scanner) {
        imprimirTexto();
        return scanner.nextDouble();

    }

    static Byte receberOperacao(Scanner scanner) {
        imprimeTextoComQuebraDelinha();
        String[] tiposDeOperacoes = {"Subtração", "adição", "multiplicação", "divisao"};
        for (int i = 0; i < tiposDeOperacoes.length; i++) {
            System.out.println("(" + i + ")" + " " + tiposDeOperacoes[i]);
        }
        return scanner.nextByte();

    }

    static Double realizarCalculo(Byte tipoDeOperacao, Double primeiroNumeroRecebido, Double segundoNumeroRecebido) {
        Double resultado = 0.0;
        switch (tipoDeOperacao) {
            case 0 -> resultado = subtracao(primeiroNumeroRecebido, segundoNumeroRecebido);
            case 1 -> resultado = adicao(primeiroNumeroRecebido, segundoNumeroRecebido);
            case 2 -> resultado = multiplicacao(primeiroNumeroRecebido, segundoNumeroRecebido);
            case 3 -> resultado = divisao(primeiroNumeroRecebido, segundoNumeroRecebido);
            default -> {
                posicaoInvalida();
            }
        }
        return resultado;
    }

    static Double adicao(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    static Double subtracao(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    static Double divisao(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero / segundoNumero;
    }

    static Double multiplicacao(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

    static void imprimirTexto() {
        System.out.print("Informe o número: ");
    }

    static void imprimeTextoComQuebraDelinha() {
        System.out.println("Qual o tipo de operação desejada: ");
    }

    static void quebraLinha() {
        System.out.println("|--------------------|");
    }

    static void posicaoInvalida() {
        System.err.println("A operação é inválida. ");
        System.exit(1);
    }
}



