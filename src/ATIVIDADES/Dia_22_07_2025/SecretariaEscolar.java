package ATIVIDADES.JAVA.Dia_22_07_2025.Atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class SecretariaEscolar {
    public static void main(String[] args) {
        int opcao, contagem = 0, consultaID = 0;
        int medias = 0;
        int contador = 0;

        String nomes;
        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<String> situacao = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        ArrayList<Double> media = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\n1-[Registra aluno(a) e notas] / 2-[Consulta por ID] / 3-[Consulta geral] / 4-[Sair]");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    medias = 0;
                    System.out.print("\n===Digite o nome do aluno(a): ");
                    nomes = input.nextLine();
                    nomes = input.nextLine();
                    alunos.add(nomes);
                    id.add(contagem);
                    System.out.println("Id do aluno: " + contagem);
                    contagem++;
                    for (int i = 0; i < 4; i++) {
                        System.out.print("\nDigite a nota " + i + " : ");
                        notas.add(input.nextDouble());
                        medias += notas.getLast();
                    }
                    medias = medias / 4;
                    media.add((double) medias);
                    if (media.getLast() >= 7) {
                        situacao.add("APROVADO");
                    } else if (media.getLast() < 7) {
                        situacao.add("REPROVADO");
                    }
                    break;
                case 2:
                    System.out.print("\n===Digite o id do aluno: ");
                    consultaID = input.nextInt();
                    System.out.println("Nome do aluno(a) - " + alunos.get(consultaID));
                    System.out.println("Média do aluno(a) - " + media.get(consultaID));
                    if (media.get(consultaID) >= 7) {
                        System.out.println("Situação do aluno(a): APROVADO");
                    } else if (media.get(consultaID) < 7) {
                        System.out.println("Situação do aluno(a): REPROVADO");
                    }
                    break;
                case 3:
                    System.out.println("\n=====Consulta completa=====");

                        for (int i = 0; i < alunos.size(); i++) {
                            System.out.println("\nID :"+id.get(i));
                            System.out.println("ALUNO: " + alunos.get(i));
                            System.out.println("MÉDIA: " + media.get(i));
                            for (int j = 0; j < notas.size(); j++) {
                                System.out.println("   NOTA: " + notas.get(j));
                            }
                        }

                    break;
            }
        } while (opcao != 4);
        input.close();
        System.err.println("Saindo");
    }
}
