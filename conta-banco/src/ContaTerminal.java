import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor , digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor , digite o numero de sua conta :");
        int numero = scanner.nextInt();

        System.out.println("Por favor , digite  sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o valor que será depositado em sua conta :");

        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
