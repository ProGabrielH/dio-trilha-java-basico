import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        
       
        System.out.println("Digite sua idade");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase());
        System.out.println("Tenho"+ idade + "anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        }
        catch(InputMismatchException e){
            System.out.println("ERRO: Entrada inválida");
        }
        scanner.close();   

    }
}