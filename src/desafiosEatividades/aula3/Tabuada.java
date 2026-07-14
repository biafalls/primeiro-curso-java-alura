package desafiosEatividades.aula3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //4.Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroDig = scanner.nextInt();

        System.out.println("-- Tabuada do " + numeroDig + " --");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroDig + " x " + i + " = " + (numeroDig * i));
        }

        scanner.close();
    }
}
