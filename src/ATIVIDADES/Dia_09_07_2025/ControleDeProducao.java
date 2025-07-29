package ATIVIDADES.JAVA.Dia_09_07_2025;

import java.util.Scanner;

public class ControleDeProducao {
    public static void main(String[] args) {
        int pecas[] = new int[8];
        int totalSemana;
        int totalGeral = 0;
        int mediaDiaria;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            totalSemana = 0;
            System.out.println("=============== SEMANA" + i + " ===============");
            for (int j = 0; j < pecas.length; j++) {
                System.out.println("Quantas peças foram produzidas no dia " + j + ": ");
                pecas[j] = input.nextInt();
                totalSemana += pecas[j];
            }
            totalGeral += totalSemana;
            System.out.println("\nTotal semana " + i + ": " + totalSemana);
        }
        mediaDiaria = totalGeral / 14;
        System.out.println("========================================");
        System.out.println("Total de peças produzidas: " + totalGeral);
        System.out.println("Média diária de produção de peças: " + mediaDiaria);
        if (mediaDiaria > 80) {
            System.out.println("Meta batida!");
        } else if (mediaDiaria >= 50 && mediaDiaria <= 80) {
            System.out.println("Meta quase atingida");
        } else if (mediaDiaria < 50) {
            System.err.println("Produção abaixo do esperado");
        }
    }
}
