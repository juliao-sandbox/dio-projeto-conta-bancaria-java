import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite os dados solicitados abaixo:");
        System.out.print("Número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Agência: ");
        String agencia = sc.next();

        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.print("Saldo do cliente: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
    }
}