package com.company.trabalhando_com_datas.desafio;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
Uma médica obstetra precisa de um software que calcula algumas datas importantes de suas clientes grávidas.
A médica deseja informar apenas a data do último período menstrual de sua cliente e o software deve calcular e exibir a data estimada do parto e
a data estimada da concepção (isso mesmo que você está pensando... o ato sexual).
Você foi contratado para desenvolver este software, por isso precisa aprender um pouco sobre gravidez:
***** A data estimada da concepção é igual a data do último período menstrual mais 2 semanas.
***** A data estimada do parto é igual a data do último período menstrual mais 40 semanas.
A classe ClaculadoraGravidez já foi iniciada, você precisa apenas implementar os métodos calcularDataEstimadaConcepcao() e
calcularDataEstimadaParto().
 */
public class CalculadoraGravidez {
    private Date dataUltimoPeriodoMenstrual;
    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }
    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    public Date calcularDataEstimadaConcepcao() {
        Calendar ultimaMenstruacao = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
        ultimaMenstruacao.add(Calendar.WEEK_OF_YEAR, 2);
        return ultimaMenstruacao.getTime();

    }
    public Date calcularDataEstimadaParto() {
        // implementar cálculo de data estimada para parto
        // 40 semanas após a data do último período menstrual
        Calendar dataParto = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
        dataParto.add(Calendar.WEEK_OF_YEAR, 40);
        return dataParto.getTime();
    }
}


