package desafiosEatividades.aula3;

import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        /*1.Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba
        "Número positivo", caso contrário, exiba "Número negativo".*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        double numeroDigitado = scanner.nextDouble();

        if(numeroDigitado > 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        scanner.close();
    }
}
