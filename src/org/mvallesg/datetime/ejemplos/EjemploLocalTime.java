package org.mvallesg.datetime.ejemplos;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class EjemploLocalTime {
    public static void main(String[] args) throws InterruptedException, IOException {

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Segundos: " + ahora.getSecond());

        LocalTime seisYMedia = LocalTime.of(6, 30, 59);
        System.out.println(seisYMedia);

        seisYMedia = LocalTime.parse("06:30");
        System.out.println(seisYMedia);

        LocalTime sieteYMedia = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println(sieteYMedia);

        boolean esAnterior = LocalTime.of(6, 30).isBefore(LocalTime.parse("07:30"));
        System.out.println(esAnterior);

        //HH -> Formato 24h; hh -> Formato AM/PM
        // a -> indica que se quiere mostrar si es AM o PM.
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:SS");
        String ahoraFormateado = seisYMedia.format(df);
        System.out.println(ahoraFormateado);

        ahoraFormateado = df.format(ahora);
        System.out.println(ahoraFormateado);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
