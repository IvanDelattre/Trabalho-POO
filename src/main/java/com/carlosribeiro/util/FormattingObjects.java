package com.carlosribeiro.util;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormattingObjects {
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static NumberFormat nf = NumberFormat.getInstance(Locale.of("pt", "BR"));

    public static LocalDate stringToLocalDate(String date){
        int dia = Integer.parseInt(date.substring(0,2));
        int mes = Integer.parseInt(date.substring(3,5));
        int ano = Integer.parseInt(date.substring(6,10));

        return LocalDate.of(ano, mes, dia);
    }
}
