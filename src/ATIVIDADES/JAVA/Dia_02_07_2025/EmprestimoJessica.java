package ATIVIDADES.JAVA.Dia_02_07_2025;

import java.util.Scanner;

public class EmprestimoJessica {
    public static void main(String[] args) {
        double salario;
        int tempoEmpresa;
        int dividas;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        salario = input.nextDouble();
        if (salario < 5000) {
            System.out.println("Empréstimo Negado");
        } else if (salario >= 5000) {

        System.out.println("Digite o ano: ");
         tempoEmpresa = input.nextInt();

        System.out.println("Dívidas recentemente?[NÃO = 1]/[SIM = 2] ");
        dividas = input.nextInt();
        if (tempoEmpresa == 4 && dividas == 1) {
            System.out.println("Empréstimo Liberado");
        }else if (tempoEmpresa < 4 || dividas == 2) {
            System.out.println("Empréstimo em Análise");
        }
        }
    }
}


