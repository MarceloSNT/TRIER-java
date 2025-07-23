package CONTEUDO.Dia_23_07_2025;

public class Pessoa {
    String name;
    String cpf;
    String sexo;
    int age;
    int codigo;
    double peso;
    double altura;
    boolean cansado;

    void trabalhar() {
        if (cansado == true){
            System.out.printf("%s precisa descansar",this.name);
        }else {
            System.out.printf("\n%s pode trabalhar a vontade",this.name);
        }
    };

    void estudar() {
        if (cansado ==true){
            System.out.printf("%s precisa descansar, mas deverá estudar um pouco",this.name);
        }else {
            System.out.printf("\n%s pode estudar a vontade",this.name);
        }
    };

    void descansar() {
        if (cansado == true){
            System.out.printf("%s precisa descansar",this.name);
        }else {
            System.out.printf("\n%s está liberado(a) para trabalhar e estudar",this.name);
        }
    };
}
