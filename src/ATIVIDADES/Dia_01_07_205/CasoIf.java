package ATIVIDADES.JAVA.Dia_01_07_205;

public class CasoIf {
    public static void main(String[] args) {
        int notaFinal = 6;

        if (notaFinal < 6){
            System.out.println("Reprovado");
        } else if (notaFinal == 6) {
            System.out.println("Recuperação");
        } else if (notaFinal > 6 && notaFinal <=10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Informe uma nota válida");
        }
    }
}
