package CONTEUDO.JAVA.Dia_02_07_2025;

import java.util.Scanner;

public class LacoRepeticaoFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numéro para contagem: ");
        int number = input.nextInt();
        System.out.println("=====Prepare-se para a contagem=====");

        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }

        System.out.println("Digite um numéro para contagem regressiva: ");
        int numberRegressivo = input.nextInt();
        System.out.println("=====Prepare-se para a contagem regressiva=====");

        for (int i = 0; i < numberRegressivo; numberRegressivo--) {
            System.out.println(numberRegressivo);
        }
        input.close();
    }
}
