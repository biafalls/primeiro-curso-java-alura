public class ScreenMatch {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Nimona");

        int anoDeLancamento = 2023;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Um cavaleiro é acusado de um crime que não cometeu, e a única pessoa que pode ajudá-lo a provar sua
                inocência é Nimona, uma adolescente que muda de forma e que também pode ser um monstro que ele jurou matar.
                """;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}