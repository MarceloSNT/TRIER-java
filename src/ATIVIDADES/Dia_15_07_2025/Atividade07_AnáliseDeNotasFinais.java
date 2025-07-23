package ATIVIDADES.JAVA.Dia_15_07_2025;

import java.util.Scanner;

public class Atividade07_AnáliseDeNotasFinais {
    public static void main(String[] args) {
        double notas[] = new double[10];
        int totalTurma = 0, opc, acimaMedia = 0;
        double mediaTurma;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.print("=====\nNota aluno " + i + " Ex-[10,0]: ");
            notas[i] = input.nextDouble();
            totalTurma += notas[i];
        }
        mediaTurma = totalTurma / 10;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("======Média: " + mediaTurma + "\nIndique o conceito: \n1-[A] / 2-[B] / 3-[C] / 4-[D] / 5-[F]");
            opc = input.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Nota A");
                    break;
                case 2:
                    System.out.println("Nota B");
                    break;
                case 3:
                    System.out.println("Nota C");
                    break;
                case 4:
                    System.out.println("Nota D");
                    break;
                case 5:
                    System.out.println("Nota F");
                    break;
            }
            if (notas[i] > mediaTurma) {
                acimaMedia++;
            }
        }
        System.out.println("\n=====Alunos acima da média " + acimaMedia);
    }
}
