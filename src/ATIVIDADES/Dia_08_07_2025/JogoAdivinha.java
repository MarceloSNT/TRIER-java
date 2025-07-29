package ATIVIDADES.JAVA.Dia_08_07_2025;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Random gerarNumero = new Random();
        int numeroAleatorio;
        numeroAleatorio = gerarNumero.nextInt(100);

        System.out.println("=====JOGO ADIVINHA=====");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 100");
        int numero = input.nextInt();

        do {
            System.out.println("Digite um número de 0 a 100");
            if (numero < numeroAleatorio) {
                System.out.println("Digite um número Maior");
                input.nextInt();
            } else if (numero > numeroAleatorio) {
                System.out.println("Digite um número Menor");
                input.nextInt();
            }
        }while (numero != numeroAleatorio);
                System.out.println("===== !!!VOCÊ ACERTOU!!! =====");
    System.out.println("O número gerado foi "+numeroAleatorio);
        }}