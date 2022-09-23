
public class Main {
    public static void souUmaFuncaoQueNaoRetornaNada(){
        System.out.println("Minha funcao nao retorna nada, ela tem toda a responsabilidade!");
    }

    public static String souUmaFuncaoQueRetornaUmaString(){
        return "Eu retorno somente uma string";
    }

    public static void souUmaFuncaoQueRecebeParametro(String parametro1){
        System.out.println(parametro1);
    }

    public static int souUmaFuncaoQueSomaNumeros(int numero1, int numero2){
        return numero1+numero2;
    }

    public static void main(String[] args) {
        souUmaFuncaoQueNaoRetornaNada();

        String resultado = souUmaFuncaoQueRetornaUmaString();
        System.out.println(resultado);

        souUmaFuncaoQueRecebeParametro("A funcao vai exibir esse valor na tela");

        int resultadoSoma = souUmaFuncaoQueSomaNumeros(1, 2);
        System.out.println("O resultado da soma e: "+resultado);
    }
}
