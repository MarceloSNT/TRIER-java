package ATIVIDADES.JAVA.Dia_15_07_2025;

import java.util.Scanner;

public class Atividade05_ControleDeVendasDiárias {
    public static void main(String[] args) {
        int vendasDiarias[] = new int[10];
        int totalVendas = 0, diaMaiorVendas = 0, opcoesSwitch = 0;
        double mediaVendas;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vendasDiarias.length; i++) {
            System.out.print("Quantas vendas no dia " + i + ": ");
            vendasDiarias[i] = input.nextInt();
            totalVendas += vendasDiarias[i];
            if (vendasDiarias[i] >= diaMaiorVendas) {
                diaMaiorVendas = i;
            }
        }
        mediaVendas = totalVendas / 10;
        for (int i = 0; i < vendasDiarias.length; i++) {
            System.out.println("==========\nA média de vendas: " + mediaVendas + "\nVendas do dia " + i + " foi de " + vendasDiarias[i] + " vendas\nDefina: 1-[Acima da média] / 2-[Na média] / 3-[Abaixo da média]");
            opcoesSwitch = input.nextInt();
            switch (opcoesSwitch) {
                case 1:
                    System.out.println("Acima da media");
                    break;
                case 2:
                    System.out.println("Na média");
                    break;
                case 3:
                    System.out.println("Abaixo da média");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
        }
        System.out.println("\n==========\nTotal de vendas foi: " + totalVendas + "\nDia com maior venda: DIA " + diaMaiorVendas + "\n==========\n");
    }
}
