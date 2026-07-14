package desafiosEatividades.aula3;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        /*3.Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do
        círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/
        Scanner s = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3){
            String menu = """
                
                ========== Menu ============
                1. Calcular área do quadrado
                2. Calcular área do círculo
                3. Sair
                """;
            System.out.println(menu);
            opcao = s.nextInt();
            switch (opcao) {
                case 1 :
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = s.nextDouble();
                    double areaQuadrado = lado * lado;
                    System.out.println("Área do quadrado: " + areaQuadrado);
                    break;
                case 2 :
                    System.out.print("Digite o raio do círculo: ");
                    double raio = s.nextDouble();
                    double areaCirculo = 3.14 * raio * raio;
                    System.out.println("Área do círculo: " + areaCirculo);
                    break;
                case 3:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        }

        s.close();
    }
}
