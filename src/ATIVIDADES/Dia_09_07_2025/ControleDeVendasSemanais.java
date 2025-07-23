package ATIVIDADES.JAVA.Dia_09_07_2025;

import java.util.Scanner;

public class ControleDeVendasSemanais {
    public static void main(String[] args) {
        double vendasDiarias[] = new double[5];
        double mediaSemana;
        double totalSemana = 0;
        double totalMensal = 0;
        double maiorFaturamento = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.println("==========Semana " + i + "==========");
            totalSemana = 0;
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe as vendas diárias (Em R$ ex:1,0)" + " dia: " + j);
                System.out.print("R$ ");
                vendasDiarias[j] = input.nextDouble();
                totalSemana += vendasDiarias[j];
            }
            totalMensal += totalSemana;
            System.out.println("\nFaturamento total da semana: " + totalSemana);
        }
        System.out.println("=============================");
        mediaSemana = totalMensal / 5;
        System.out.println("Faturamento total do período de 5 semanas: " + totalMensal);
        System.out.println("Média diária de vendas: " + mediaSemana);
        if (totalSemana > maiorFaturamento) {
            maiorFaturamento = totalSemana;
        }
        System.out.println("Semana de maior faturamento: " + maiorFaturamento);
        if (mediaSemana > 500) {
            System.out.println("!!!Excelente trabalho!!!");
        } else if (mediaSemana < 500) {
            System.err.println("Avaliar estratégias de venda");
        }
        input.close();
    }
}
