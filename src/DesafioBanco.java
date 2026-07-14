import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //inicializar dados do cliente
        String nome = "Ana Carolina Silva";
        String tipoConta = "Corrente";
        double saldo = 3500.50;

        String dadosIniciais = """
                ====================================
                Dados Iniciais do Cliente
                
                Nome:           %s
                Tipo conta:     %s
                Saldo Inicial:  %.2f
                ====================================
                """.formatted(nome, tipoConta, saldo);
        System.out.println(dadosIniciais);

        String menu = """
                ======== Menu ========
                1. Consultar Saldo
                2. Depósito
                3. Saque
                4. Sair
                
                Escolha uma opção:
                """;
        int opcao = 0;
        double valor = 0;

        while (opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();
            switch (opcao)  {
                case 1:
                    System.out.println("Saldo atual: R$" + saldo + "\n");
                    break;
                case 2:
                    System.out.print("Informe o valor que deseja depositar: ");
                    valor = scanner.nextDouble();

                    if (valor <= 0) {
                        System.out.println("Informe um valor maior que zero\n");
                        break;
                    }

                    saldo +=valor;
                    System.out.println("Saldo atualizado: " + saldo + "\n");
                    break;
                case 3:
                    System.out.print("Informe o valor que deseja sacar: ");
                    valor = scanner.nextDouble();

                    if (valor > saldo) {
                        System.out.println("Não há saldo suficiente para fazer esse saque \n");
                        break;
                    }

                    if (valor <= 0) {
                        System.out.println("Informe um valor maior que zero\n");
                        break;
                    }

                    saldo -=valor;
                    System.out.println("Saldo atualizado: " + saldo + "\n");
                    break;
                case 4:
                    System.out.println("\nSaindo da Aplicação...");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }
        }

        scanner.close();
    }
}
