package desafiosEatividades.aula2;

public class ConversaoDolarReal {
    public static void main(String[] args) {
        /*5.Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o
        valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o
        resultado formatado.*/
        double valorEmDolares = 1;
        double taxa = 4.94;

        double valorEmReais = valorEmDolares * taxa;

        System.out.println("O valor em reais é: " + valorEmReais);
    }
}
