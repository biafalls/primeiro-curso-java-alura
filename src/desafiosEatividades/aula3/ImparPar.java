package desafiosEatividades.aula3;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        /*5.Crie um programa que solicite ao usuário a entrada de um número inteiro.
        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é Par");
        } else {
            System.out.println("O número é ímpar");
        }

        scanner.close();
    }
}
