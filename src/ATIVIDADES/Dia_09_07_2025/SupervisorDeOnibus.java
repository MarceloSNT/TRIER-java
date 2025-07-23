package ATIVIDADES.JAVA.Dia_09_07_2025;

import java.util.Scanner;

public class SupervisorDeOnibus {
    public static void main(String[] args) {
        int pessoasPorDia[] = new int[7];
        int pessoalPorSemana = 0;
        int pessoalPorMes = 0;
        int mediaDePessoasPorSemana;
        int pessoasPorSemanaTotal = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 5; i++) {
            pessoalPorSemana = 0;
            System.out.println("========== Semana "+i+" ==========");
            for (int j = 0; j < pessoasPorDia.length; j++) {
                System.out.println("Quantas pegaram o micro-ônibus hoje dia "+j);
                pessoasPorDia[j] = input.nextInt();
                pessoalPorSemana += pessoasPorDia[j];
            }
                pessoalPorMes += pessoalPorSemana;
            System.out.println("\nPessoas na semana "+i+": " + pessoalPorSemana);
        }
        mediaDePessoasPorSemana = pessoalPorMes / 4;
        pessoasPorSemanaTotal = mediaDePessoasPorSemana;
        System.out.println("===============================");
        System.out.println("Pessoas que pegaram o micro-ônibus durante o mês: "+pessoalPorMes);
        System.out.println("Média de pessoas por semana: "+mediaDePessoasPorSemana);
        if (pessoasPorSemanaTotal > 30 && pessoasPorSemanaTotal < 59){
            System.out.println("Recomendação: Operar com 2 micro-ônibus");
        }else if (pessoasPorSemanaTotal > 60) {
            System.out.println("Recomendação: Operar com 4 micro-ônibus");
        }
    }
}
