package CONTEUDO.Dia_23_07_2025;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoas = new Pessoa();
        pessoas.codigo = 1;
        pessoas.name = "Ana Carolina";
        pessoas.age = 19;
        pessoas.peso = 45.7;
        pessoas.altura = 1.60;
        pessoas.cpf = "123.456.789-00";
        pessoas.sexo = "Feminino";
        pessoas.cansado = false;

        System.out.println("Código: "+ pessoas.codigo);
        System.out.println("Nome: "+pessoas.name);
        System.out.println("Idade: "+pessoas.age);
        System.out.println("Peso: "+pessoas.peso);
        System.out.println("Altura: "+pessoas.altura);
        System.out.println("CPF: "+pessoas.cpf);
        System.out.println("Sexo: "+pessoas.sexo);
        System.out.println("Cansado(a): "+pessoas.cansado);
        pessoas.trabalhar();
        pessoas.descansar();
    }
}
