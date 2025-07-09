package ATIVIDADES.JAVA.Dia_09_07_2025;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NotasDeAlunosEmAvaliações {
    public static void main(String[] args) {
        double mediaFinal = 0;
        double mediaTotalAlunos = 0;
        double notas[] = new double[4];
        int totalAprovado = 0;
        int totalReprovado = 0;
        int totalRecuperacao = 0;
        DecimalFormat df = new DecimalFormat("0,00");

        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 5; i++) {
            mediaFinal = 0;
            System.out.println("==========Aluno: " + i + "==========");
            for (int j = 0; j < 4; j++) {
                System.out.println("Prova " + j + "\nNota(ex:10,0 use a vírgula): ");
                notas[j] = input.nextDouble();
                mediaFinal += notas[j] / 4;
            }
            System.out.println("Média final aluno: " + mediaFinal);
            if (mediaFinal >= 7) {
                System.out.println("Aprovado");
                totalAprovado++;
            } else if (mediaFinal >= 5 && mediaFinal < 7) {
                System.out.println("Recuperação");
                totalRecuperacao++;
            } else if (mediaFinal < 5) {
                System.out.println("Reprovado");
                totalReprovado++;
            }
            mediaTotalAlunos += mediaFinal / 4;
        }
        System.out.println("=============================");
        System.out.println("Média geral da turma: " +df.format(mediaTotalAlunos));
        System.out.println("Quantidade de Aprovados: "+totalAprovado);
        System.out.println("Quantidade em Recuperação: "+totalRecuperacao);
        System.out.println("Quantidade de Reprovados: "+totalReprovado);
    }
}
