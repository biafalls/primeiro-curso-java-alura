package desafiosEatividades.aula3;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme:");
            nota = scanner.nextDouble();
            media += nota;
        }

        System.out.println("Média de avaliações " + media/3);
        scanner.close();
    }
}
