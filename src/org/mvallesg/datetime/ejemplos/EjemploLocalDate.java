package org.mvallesg.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Día: " + fechaActual.getDayOfMonth());
        Month mes = fechaActual.getMonth();
        System.out.println("Mes: " + mes);
        System.out.println("Número el mes: " + mes.getValue());
        System.out.println("Mes en español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        System.out.println();

        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Número del día: " + diaSemana.getValue());
        System.out.println("Nombre del día: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        System.out.println();

        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Día del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());

        fechaActual = LocalDate.of(2022, 12, 25);
        System.out.println(fechaActual);

        fechaActual = LocalDate.of(2022, Month.JULY, 7);
        System.out.println(fechaActual);

        fechaActual = LocalDate.parse("2022-01-01");
        System.out.println(fechaActual);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        LocalDate mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(mesAnteriorMismoDia);

        DayOfWeek hoy = LocalDate.parse("1996-07-07").getDayOfWeek();
        System.out.println(hoy);

        int diaMes = LocalDate.of(2022, 12, 24).getDayOfMonth();
        System.out.println(diaMes);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println(esBisiesto);

        boolean esAntes = LocalDate.of(2022, 10, 24).isBefore(LocalDate.parse("2022-10-25"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.of(2022, 10, 24).isAfter(LocalDate.parse("2022-10-25"));
        System.out.println("esDespues = " + esDespues);
    }
}
