package ATIVIDADES.JAVA.Dia_02_07_2025;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Qual tabuada:");
        number = input.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+"x"+number+"= "+i*number);
        }
        System.out.println("====================");
    }
}
