import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação do número da agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine(); // Lê o número da agência como uma string

        // Solicitação do número da conta
        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt(); // Lê o número da conta como um inteiro

        // Consumir a quebra de linha deixada pelo nextInt
        scanner.nextLine();

        // Solicitação do nome do cliente
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine(); // Lê o nome do cliente como uma string

        // Solicitação do saldo da conta
        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = scanner.nextDouble(); // Lê o saldo como um número decimal (double)

        // Exibição da mensagem formatada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo "
                + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
