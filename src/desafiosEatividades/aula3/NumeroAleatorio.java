package desafiosEatividades.aula3;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(101); // gera um número aleatório entre 0 e 100
        final int MAX_TENTATIVAS = 5;

        System.out.println("Tente adivinhar um número de 0 a 100 em 5 tentativas");
        int numeroDigitado = 0;


        for (int tentativa = 1; tentativa <= MAX_TENTATIVAS; tentativa++) {
            System.out.println("Tentativa " + tentativa + " de " + MAX_TENTATIVAS + ":");
            numeroDigitado = s.nextInt();

            if (numeroDigitado == numeroAleatorio) {
                String palavraTentativa = (tentativa > 1 ? "tentativas" : "tentativa");
                System.out.printf("Parabéns! Você acertou o número secreto com %d %s",
                        tentativa, palavraTentativa);
                break;
            } else if (numeroDigitado > numeroAleatorio){
                System.out.println("O número secreto é menor que " + numeroDigitado);
            } else {
                System.out.println("O número secreto é maior que " + numeroDigitado);
            }
        }

        if (numeroDigitado != numeroAleatorio) {
            System.out.println("Você não consegiu acertar em " + MAX_TENTATIVAS + " ! O número secreto era " + numeroAleatorio);
        }

        s.close();
    }
}
