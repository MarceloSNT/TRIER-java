package ATIVIDADES.JAVA.Dia_15_07_2025;

import java.util.Scanner;

public class Atividade04_AvaliaçãoDeDesempenhoDeFuncionários {
    public static void main(String[] args) {
        int notas[] = new int[6];
        int desempenho;
        int desempenhoRuim = 0, desempenhoMedio = 0, desempenhoBom = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("=====Digite a nota " + i + ": ");
            notas[i] = input.nextInt();
            System.out.println("Classifique o desempenho:\n1-[Ruim] / 2-[Médio] / 3-[Bom] ");
            desempenho = input.nextInt();
            switch (desempenho) {
                case 1:
                    desempenhoRuim++;
                    break;
                case 2:
                    desempenhoMedio++;
                    break;
                case 3:
                    desempenhoBom++;
                    break;
                case 4:
                    input.close();
                    break;
            }
        }
        System.out.println("\n=====CLASSIFICAÇÃO DE DESEMPENHOS=====");
        System.out.println("Desempenhos Ruins: " + desempenhoRuim);
        System.out.println("Desempenhos Médios: " + desempenhoMedio);
        System.out.println("Desempenhos Bons: " + desempenhoBom);

    }
}

