package ATIVIDADES.JAVA.Dia_15_07_2025;

import java.util.Scanner;

public class Atividade09_CadastroDeProdutosComCódigos {
    public static void main(String[] args) {
        int produtos[] ={1,2,3,4,5,6,7,8,9,10};
        int codigo;
        int opc = 0;

        Scanner input = new Scanner(System.in);

        while (opc != 2){
            System.out.println("==========\n1-[Consultar] / 2-[Sair]");
            opc = input.nextInt();
            switch (opc){
                case 1:
                    System.out.print("Digite o código:");
                    codigo = input.nextInt();
                    if (codigo <= 0 || codigo > 10){
                        System.err.println("Código não encontrado");
                    }else {
                        System.out.println("Código encontrado");
                    }break;
                case 2:
                    System.out.println("\nSaindo\n==========");
                    input.close();
                    break;
            }
        }
    }
}
