package ATIVIDADES.JAVA.Dia_08_07_2025;

import java.util.Scanner;

public class GerenteHotel {
    public static void main(String[] args) {
        int dia[] = new int[7];
        int total = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            int totalSemana = 0;
            System.out.println("==================================");
            System.out.println("Semana "+i);
            for (int j = 0; j < dia.length; j++) {
                System.out.println("Quantas pessoas no dia "+j+": ");
                dia[j] = input.nextInt();
                totalSemana += dia[j];
            }
            total += totalSemana;
            System.out.println("==============================");
            System.out.println("Total de pessoas na semana "+i+": "+totalSemana);
        }
        int mediaMensal = total/2;
        System.out.println("===============================");
        System.out.println("Total de pessoas das duas semanas: "+total);
        System.out.println("Média de pessoas no mês: "+mediaMensal);
    }
}
