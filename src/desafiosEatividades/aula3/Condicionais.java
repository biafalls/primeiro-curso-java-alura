package desafiosEatividades.aula3;

public class Condicionais {
    public static void main(String[] args) {
        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2023) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filmes retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Pague R$15.90 para assistir esse filme");
        }
    }
}