package CONTEUDO.JAVA.Dia_02_07_2025;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numberRandom;
        numberRandom = gerador.nextInt(100);

        Scanner input = new Scanner(System.in);
        System.out.println("Adivinhe o número de 0 a 100");
        int number = input.nextInt();

        if (number == numberRandom){
        System.out.println("Parabéns você acertou");
        }else if (number != numberRandom){
            System.out.println("Você errou");
        }
    }
}
