package desafiosEatividades.aula2;

public class Produto {
    public static void main(String[] args) {
        /*4.Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor
        total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/
        double precoProduto = 5.49;
        int quantidade = 4;
        double total = precoProduto * quantidade;

        String mensagem = "O valor total da compra é R$" + total;
        System.out.println(mensagem);
    }

}
