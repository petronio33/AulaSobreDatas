/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.temporal.*;

public class AulaTeste {
    public static void main(String[] args){
        
        //Pegar data atual
        System.out.println("\nData atual:");
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        //criar data especifica
        System.out.println("\ncriar data especifica:");
        LocalDate atentado = LocalDate.of(2001,10,11);
        System.out.println(atentado);
        
        //Para mostrar no formato BR
        System.out.println("\nformato BR:");
        DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String hojeFormatado = hoje.format(formatador);
        System.out.println(hojeFormatado);
        
        //Pegar informações de uma data
        System.out.println("\nPegar informações de uma data:");
        System.out.println("Dia da semana "+hoje.getDayOfWeek().name());
        System.out.println("Dia "+hoje.getDayOfMonth());
        System.out.println("Mes "+hoje.getMonthValue());
        System.out.println("Mes "+hoje.getMonth().name());
        System.out.println("Ano "+hoje.getYear());
        
        //Em BR
        System.out.println("\nPegar informações de uma data em BR:");
        String diaDaSemana  = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        String mes = hoje.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Dia da Semana " + diaDaSemana);
        System.out.println("Mês " + mes);
        
        //Pegar o tempo decorrido entre duas datas
        System.out.println("\nTempo decorrido entre duas datas:");
        LocalDate niverW = LocalDate.of(1987, 11, 10);
        LocalDate niverC = LocalDate.of(1998, 5, 19);
        Period periodo = Period.between(niverW, niverC);
        System.out.println("Anos "+periodo.getYears());
        System.out.println("Meses "+periodo.getMonths());
        System.out.println("Dias "+periodo.getDays());
        
        //Pegar o tempo decorrido total em meses ou dias
        System.out.println("\nTempo decorrido total em meses ou dias:");
        long totalAnos =ChronoUnit.YEARS.between(niverW, niverC);
        long totalMeses =ChronoUnit.MONTHS.between(niverW, niverC);
        long totalDias =ChronoUnit.DAYS.between(niverW, niverC);
        System.out.println("Total Anos "+totalAnos);
        System.out.println("Total Meses "+totalMeses);
        System.out.println("Total Dias "+totalDias);
        
        //Operações em uma conta
        System.out.println("\nOperações em uma conta:");
        System.out.println("mais 5 dias "+hoje.plusDays(5));
        System.out.println("mais 5 semanas "+hoje.plusWeeks(5));
        System.out.println("mais 5 anos "+hoje.plusYears(5));
        System.out.println("mais 2 meses "+hoje.plusMonths(2));
        System.out.println("menos 1 ano "+hoje.minusYears(1));
        System.out.println("menos 1 mes "+hoje.minusMonths(1));
        System.out.println("menos 3 dias "+hoje.minusDays(3));
        
        //Data com tempo
        System.out.println("\nData com tempo:");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data/Hora: " + agora);
        //Data com tempo 2º opção
        System.out.println("\nData com tempo opção 2:");
        DateTimeFormatter formatador2 = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM);
        String hojeFormatado2 = hoje.format(formatador2);
        System.out.println(hojeFormatado2);
    }
}
