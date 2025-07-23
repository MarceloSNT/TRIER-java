package ATIVIDADES.JAVA.Dia_15_07_2025;

import java.util.Scanner;

public class Atividade10_CalculadoraDeConsumoDeEnergia {
    public static void main(String[] args) {
        double consumo[] = new double[6], total = 0;
        int faixa = 0, contTarifaBaixa = 0, contTarifaMedia = 0, contTarifaAlta = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < consumo.length; i++) {
            System.out.print("===============\nConsumo casa " + i + " em kWh:EX-[30,0] ");
            consumo[i] = input.nextDouble();
            System.out.println("Faixa Tarifária\n1-Baixa-[Até 30kWh] / 2-Média-[31 kWh - 100 kWh] / 3-Alta-[101 kWh - Acima]");
            faixa = input.nextInt();
            switch (faixa) {
                case 1:
                    double tarifaBaixa = consumo[i] * 0.17225;
                    total += tarifaBaixa;
                    contTarifaBaixa++;
                    break;
                case 2:
                    double tarifaMedia = consumo[i] * 0.29527;
                    total += tarifaMedia;
                    contTarifaMedia++;
                    break;
                case 3:
                    double tarifaAlta = consumo[i] * 0.44292;
                    total += tarifaAlta;
                    contTarifaAlta++;
                    break;
            }
        }
        System.out.println("==========\nTotal consumido R$: " + total + "\nCasas na faixa Alta: " + contTarifaAlta + "\nCasas na faixa média: " + contTarifaMedia + "\nCasas na faixa baixa: " + contTarifaBaixa);
    }
}
