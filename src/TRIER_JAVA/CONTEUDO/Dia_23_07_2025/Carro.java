package TRIER_JAVA.CONTEUDO.Dia_23_07_2025;

public class Carro {

    public  String      modelo;
    public  String      marca;
    public  String      cor;
    public  boolean      situacao;
    public  String      observacao;
    public  int         km;
    public  int         ano;
    public  boolean     cambio;
    private String      placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    void cambioAutomatico(){
        if (cambio==true){
            System.out.println("Câmbio: automático");
        } else if (cambio==false) {
            System.out.println("Câmbio: manual");
        }
    }

    void andar(){
        if (situacao == true){
            System.out.printf("O %s está em perfeito estado para andar ",this.modelo);
        } else
            System.out.printf("O %S não está em condições de andar ",this.modelo);
    }
    void estado(){
        if (situacao==true){
            System.out.println("\nSituação: Perfeito estado ");
        } else if (situacao == false) {
            System.out.println("\nSituação: Quebrado ");
        }
    }
    void freiar(){
        System.err.printf("\nO carro %s precisa freiar urgente",this.modelo);
    }
    void ligar(){
        if (situacao ==true){
        System.out.printf("\nO carro %s sera ligado em... \n",this.modelo);
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
        }
        }else {
            System.out.printf("\nO carro %s não está em condições para ser ligado",this.modelo);
        }
    }
    void acelerar(){
        System.out.println("Acelerando");
    }
}
