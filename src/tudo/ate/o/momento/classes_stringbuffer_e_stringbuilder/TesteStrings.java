package com.company.classes_stringbuffer_e_stringbuilder;

public class TesteStrings {
    public static void main(String[] args) {
        String s = "Olá";
        s += " Pessoal!";

        System.out.println(s);

        StringBuilder sb = new StringBuilder("Olá");
        sb.append(" Pessoal!");
        sb.append(" Meu nome é Juan.");

        String resultado = sb.toString();
        System.out.println("Com string builder: " + resultado);

        StringBuilder ola = new StringBuilder("Sou a pessoa mais bonita do mundo");
        ola.append(". E me chamo Juan.");

        String resultado2 = ola.toString();
        System.out.println(resultado2);
    }
}
