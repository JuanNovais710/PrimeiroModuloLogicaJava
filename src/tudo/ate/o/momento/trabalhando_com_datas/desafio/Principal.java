package com.company.trabalhando_com_datas.desafio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

    public class Principal {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            try {
                System.out.println("Data do último período menstrual (dd/mm/aaaa):");
                String ultimoPeriodoMenstrual = entrada.nextLine();
                Date dataUltimoPeriodoMenstrual = converterEmData(ultimoPeriodoMenstrual);
                CalculadoraGravidez calculadora = new CalculadoraGravidez(dataUltimoPeriodoMenstrual);
                Date dataEstimadaConcepcao = calculadora.calcularDataEstimadaConcepcao();
                System.out.println("Data estimada da concepção: "
                        + formatarData(dataEstimadaConcepcao));
                Date dataEstimadaParto = calculadora.calcularDataEstimadaParto();
                System.out.println("Data estimada para parto: "
                        + formatarData(dataEstimadaParto));
            } catch (ParseException pe) {
                System.out.println("Informe uma data no padrão dd/mm/aaaa.");
            }
        }
        private static String formatarData(Date data) {
            // Padrão de formatação de data por extenso
            // A classe Locale representa uma região no planeta, sendo neste caso
            // o Brasil (br), onde falamos Português (pt)
            // O Locale é usado aqui para formatar a data em português brasileiro
            DateFormat formatador = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy",
                    new Locale("pt", "br"));
            return formatador.format(data);
        }
        private static Date converterEmData(String texto) throws ParseException {
            DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            Date data = dataFormatada.parse(texto);
            return data;
        }
    }

