package ATIVIDADES.JAVA.Dia_15_07_2025;

import java.util.Scanner;

public class Atividade02_RegistroDeTemperaturasSemanais {
    public static void main(String[] args) {
        double temperaturas[] = new double[7];
        double totalTemperaturas = 0, maiorTemperatura = 0, mediaTemperaturas = 0;
        int maiorTemperaturaDia = 0, menorTemperaturaDia = 0, classificar = 0;
        double menorTemperatura = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Digite a temperatura do dia " + i + ": ");
            temperaturas[i] = input.nextDouble();
            totalTemperaturas += temperaturas[i];
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
                maiorTemperaturaDia = i;
            }
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
                menorTemperaturaDia = i;
            }
        }
        mediaTemperaturas = totalTemperaturas / 7;
        System.out.println("==========\nMédia de temperatura: " + mediaTemperaturas + "\nMenor temperatura: " + menorTemperatura + " no dia " + menorTemperaturaDia + "\nMaior temperatura: " + maiorTemperatura + " no dia " + maiorTemperaturaDia + "\nClassifique:\n1-[frio]/2-[Normal]/3-[Calor]");
        classificar = input.nextInt();
        switch (classificar) {
            case 1:
                System.out.println("Definido como Frio");
                break;
            case 2:
                System.out.println("Definido como Normal");
                break;
            case 3:
                System.out.println("Definido como Calor");
                break;
        }
    }
}

