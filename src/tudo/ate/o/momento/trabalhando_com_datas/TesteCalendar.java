package com.company.trabalhando_com_datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {
    public static void main(String[] args) {
        Calendar calendario = new GregorianCalendar();
        calendario.set(Calendar.DAY_OF_MONTH, 31);
        calendario.set(Calendar.MONTH, 0);
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MINUTE, 57);
        calendario.set(Calendar.SECOND, 33);

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatador.format(calendario.getTime()));

        calendario.add(Calendar.MONTH,1);
        System.out.println(formatador.format(calendario.getTime()));

        calendario.roll(Calendar.DAY_OF_MONTH, 1);
        System.out.println(formatador.format(calendario.getTime()));
    }
}
