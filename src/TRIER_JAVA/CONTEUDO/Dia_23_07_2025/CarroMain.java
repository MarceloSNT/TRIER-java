package TRIER_JAVA.CONTEUDO.Dia_23_07_2025;

import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        int opc = 0, velocidade = 0;
        Scanner input = new Scanner(System.in);
        Carro carro = new Carro();

        carro.marca = "Mustang";
        carro.modelo = "Mach 1";
        carro.km = 20000;
        carro.cor = "Preto";
        carro.observacao = "Sem batida";
        carro.ano = 2024;
        carro.situacao = false;
        carro.cambio = true;
        carro.setPlaca("123ABC");

        do {
            System.out.println("\n===Para iniciar o sistema, escolha uma opção===");
            System.out.println("1 - Verificar o estado do carro");
            System.out.println("2 - Ligar o carro");
            System.out.println("3 - Desligar o carro");
            System.out.println("4 - Freiar o carro");
            System.out.println("5 - Verificar informações do carro");
            System.out.println("6 - Sair");
            opc = input.nextInt();
            switch (opc) {
                case 1:
                    carro.estado();
                    carro.andar();
                    System.out.printf("\nO carro %s está com as seguintes observações: %s\n", carro.modelo, carro.observacao);
                    break;
                case 2:
                    carro.ligar();
                    break;
                case 3:
                    if (carro.situacao == true) {
                        System.out.printf("Desligando %s \n", carro.modelo);
                        for (int i = 3; i > 0; i--) {
                            System.out.println(i);
                        }
                    } else
                        System.out.printf("%s não foi ligado, por não ter condições, então não precisa desligar\n", carro.modelo);
                    break;
                case 4:
                    System.out.println("Qual a velocidade atual");
                    velocidade = input.nextInt();
                    if (velocidade > 110) {
                        carro.freiar();
                    } else
                        carro.acelerar();
                    break;
                case 5:
                    System.out.println("\nMarca: " + carro.marca);
                    System.out.println("Modelo: " + carro.modelo);
                    System.out.println("Cor: " + carro.cor);
                    System.out.println("Ano: " + carro.ano);
                    System.out.println("Km rodados: " + carro.km);
                    System.out.println("Placa: " + carro.getPlaca());
                    carro.cambioAutomatico();
                    System.out.println("Observações: " + carro.observacao);
                    carro.estado();
                    break;
                case 6:
                    input.close();
                    System.err.println("Saindo");
                    break;
                default:
                    break;
            }
        } while (opc != 6);
    }
}
