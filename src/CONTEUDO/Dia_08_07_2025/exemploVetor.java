package CONTEUDO.JAVA.Dia_08_07_2025;

public class exemploVetor {
    public static void main(String[] args) {
        String name[] = {"Ana","Marcelo","antonio"};

        int i,n = name.length;
        for (i = 0; i < n; i++) {
            System.out.printf("%dº nome = %s\n",(i+1),name[i]);
        }

        String mes[] = {"janeiro","fevereiro","março","maio","junho","julho","agosto","setembro","outobro","novembro","dezembro"};

        int diaMes[] = {31,28,31,30,31,30,31,31,30,31,30,};

        int e;
        for (e = 0; e < 12 ; e++) {
            System.out.printf("%s, tem %d dias.\n",mes[e],diaMes[e]);
        }

    }
}
