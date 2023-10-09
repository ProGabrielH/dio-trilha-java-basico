import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;

        valorFinal = valorInicial * Math.pow(taxaJuros+ 1, periodo);

        System.out.println("Valor final do investimento: R$ " + String.format("%.2f", valorFinal));
        scanner.close();
    }
}