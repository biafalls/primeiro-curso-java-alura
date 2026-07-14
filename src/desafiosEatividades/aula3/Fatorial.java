package desafiosEatividades.aula3;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        //6.Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);

        scanner.close();
    }
}
