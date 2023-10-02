import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número de Agência: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite qual a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Conta criada!");
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
