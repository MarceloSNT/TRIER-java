package ATIVIDADES.JAVA.Dia_15_07_2025;

import java.util.Scanner;

public class Atividade06_SistemaDeFrequênciaEscolar {
    public static void main(String[] args) {
        int alunos[][] = new int[8][5];
        int faltas[] = new int[8];
        char opc;
        int menorFrequencia = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("=====Aluno " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Dia " + j + "\nF-[FALTA] / P-[PRESENTE] / A-[ATRASOU]");
                opc = input.next().charAt(0);
                switch (opc) {
                    case 'P', 'p':
                        alunos[i][j] = 'P';
                        break;
                    case 'F', 'f', 'a', 'A':
                        alunos[i][j] = faltas[i]++;
                        break;
                }
            }
        }
        for (int i = 0; i < faltas.length; i++) {
            if (faltas[i] <= menorFrequencia) {
                menorFrequencia = i;
            }
        }
        System.out.println("\nAluno com maior frequência: Aluno " + menorFrequencia);
    }
}
