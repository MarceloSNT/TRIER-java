package ATIVIDADES.JAVA.Dia_22_07_2025.Atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {
        int opcoes = 0;
        int contagem = 0;
        int consulta;
        String texto;

        ArrayList<String> nome = new ArrayList<String>();
        ArrayList<String> time = new ArrayList<String>();
        ArrayList<Integer> idade = new ArrayList<Integer>();
        ArrayList<Integer> id = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        while (opcoes != 9) {
            System.out.println("\n=====Escolha uma opção" +
                    "\n1-[Cadastar cliente]" +
                    "\n2-[Consultar por id]" +
                    "\n3-[Consulta completa]" +
                    "\n4-[Remover todos os dados de acordo com o código gerado]" +
                    "\n5-[Remover todos os dados cadastrados]" +
                    "\n9-[Sair]");
            opcoes = input.nextInt();
            switch (opcoes) {
                case 1:
                    System.out.println("=====Cadastro de Cliente=====");
                    System.out.println("Informe seu nome");
                    texto = input.nextLine();
                    texto = input.nextLine();
                    nome.add(texto);
                    System.out.println("Informe sua Idade");
                    idade.add(input.nextInt());
                    System.out.println("Informe seu time do coração");
                    texto = input.nextLine();
                    texto = input.nextLine();
                    time.add(texto);
                    id.add(contagem);
                    System.out.printf("Seu id:%d",contagem);
                    contagem++;
                    break;

                case 2:
                    System.out.println("===Digite o id a ser consultado");
                    consulta = input.nextInt();
                    System.out.println("Seu id: " + id.get(consulta));
                    System.out.println("\nSeu nome: " + nome.get(consulta));
                    System.out.println("\nIdade: " + idade.get(consulta));
                    System.out.println("\nTime do coração: " + time.get(consulta));
                    break;
                case 3:
                    for (int i = 0; i < nome.size(); i++) {
                        System.out.println("=====Consulta completa");
                        System.out.println("ID " + id.get(i));
                        System.out.println("NOME " + nome.get(i));
                        System.out.println("IDADE " + idade.get(i));
                        System.out.println("TIME DO CORAÇÃO " + time.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Digite o código a ser removido:");
                    consulta = input.nextInt();
                    id.remove(consulta);
                    nome.remove(consulta);
                    idade.remove(consulta);
                    time.remove(consulta);
                    System.err.println("Removido");
                    break;
                case 5:
                    id.clear();
                    nome.clear();
                    idade.clear();
                    time.clear();
                    System.err.println("Apagado com sucesso");
                    System.out.println("\nSelecione 9 para sair");
                    break;
                case 9:
                    System.err.println("Saindo...");
                    input.close();
                    break;
            }
        }
    }
}
