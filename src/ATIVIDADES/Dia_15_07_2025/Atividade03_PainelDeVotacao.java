package ATIVIDADES.JAVA.Dia_15_07_2025;

import java.util.Scanner;

public class Atividade03_PainelDeVotacao {
    public static void main(String[] args) {
        int opcoes[] = new int[3];
        int opcoesSwitch = 0;
        Scanner input = new Scanner(System.in);
        while (opcoesSwitch != 4) {
            System.out.println("==========VOTAÇÃO==========\nDIGITE: 1-[Opção 1] / 2-[Opção 2] / 3-[Opção 3] / 4-[Encerrar votação]");
            opcoesSwitch = input.nextInt();
            switch (opcoesSwitch) {
                case 1:
                    opcoes[0]++;
                    break;
                case 2:
                    opcoes[1]++;
                    break;
                case 3:
                    opcoes[2]++;
                    break;
                case 4:
                    System.out.println("Votação Encerrada");
                    input.close();
                    break;
            }
            System.out.println("Obrigado por votar");
        }
        System.out.println("==========GRÁFICO DE VOTAÇÃO==========");
        String asterisco;
        for (int i = 0; i < 3; i++) {
            asterisco = "*".repeat(opcoes[i]);
            System.out.println("Votos para Opção " + i + ": " + asterisco);
        }
    }
}
