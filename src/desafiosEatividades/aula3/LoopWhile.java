package desafiosEatividades.aula3;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar:");
            nota = scanner.nextDouble();

            if ( nota != -1){
                media += nota;
                totalDeNotas++;
            }
        }

        if (totalDeNotas > 0) {
            System.out.println("Média de avaliações " + media/totalDeNotas);
        }
        scanner.close();
    }
}
