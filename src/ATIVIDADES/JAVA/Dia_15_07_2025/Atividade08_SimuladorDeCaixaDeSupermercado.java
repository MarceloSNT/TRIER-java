package ATIVIDADES.JAVA.Dia_15_07_2025;

import java.util.Scanner;

public class Atividade08_SimuladorDeCaixaDeSupermercado {
    public static void main(String[] args) {
        double valores[] = new double[15];
        double total = 0;
        int opc, desconto1 = 0, desconto2 = 0, desconto3 = 0, nenhumDesconto = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.println("=====Digite o valor EX-[10,0]");
            valores[i] = input.nextDouble();
            System.out.println("=====DESCONTOS\n1-[R$100 - R$20]\n2-[R$150 - R$30]\n3-[R$200 - R$40]\n4-[Nenhum desconto]");
            opc = input.nextInt();
            switch (opc) {
                case 1:
                    double desconto01 = valores[i] - 20;
                    valores[i] = desconto01;
                    desconto1++;
                    System.out.println("Total da compra = R$" + desconto01);
                    break;
                case 2:
                    double desconto02 = valores[i] - 30;
                    valores[i] = desconto02;
                    desconto2++;
                    System.out.println("Total da compra = R$" + desconto02);
                    break;
                case 3:
                    double desconto03 = valores[i] - 40;
                    valores[i] = desconto03;
                    desconto3++;
                    System.out.println("Total da compra = R$" + desconto03);
                    break;
                default:
                    System.out.println("Nenhum desconto aplicado\nTotal da compra = R$" + valores[i]);
                    nenhumDesconto++;
                    break;
            }
            total += valores[i];
        }
        System.out.println("\n==========\nValor total da compra = R$" + total + "\nReceberam R$20 de desconto: " + desconto1 + "\nReceberam R$30 de desconto:" + desconto2 + "\nReceberam R$40 de desconto:" + desconto3 + "\nNão recebem nenhum desconto: " + nenhumDesconto);
    }
}
