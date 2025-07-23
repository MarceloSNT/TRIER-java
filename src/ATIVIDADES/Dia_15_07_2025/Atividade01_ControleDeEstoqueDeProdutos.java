package ATIVIDADES.JAVA.Dia_15_07_2025;

import java.util.Scanner;

public class Atividade01_ControleDeEstoqueDeProdutos {
    public static void main(String[] args) {
        int quantidade[] = new int[5];
        int quantidadeTotal = 0;
        int opcoes = 0;
        Scanner input = new Scanner(System.in);

        while (opcoes != 3) {
            System.out.println("=================================");
            System.out.println("Escolha uma opção:\n1-Entrada\n2-Saída\n3-Sair");
            opcoes = input.nextInt();
            for (int i = 0; i < quantidade.length; i++) {
                switch (opcoes) {
                    case 1:
                        System.out.println("Quantidade de Entrada produto " + i + ": ");
                        quantidadeTotal = input.nextInt();
                        quantidade[i] += quantidadeTotal;
                        break;
                    case 2:
                        System.out.println("Quantidade de Saída: ");
                        quantidadeTotal = input.nextInt();
                        quantidade[i] -= quantidadeTotal;
                        break;
                }

            }
        }
        System.out.println("==========RELATÓRIO FINAL==========");
        for (int i = 0; i < quantidade.length; i++) {
            System.out.println("Quantidade total do produto " + i + ": " + quantidade[i]);
        }
        System.out.println("================================");
    }
}