package PrimeirosDesafios;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList<>();

    int quantidadeAtivos = scanner.nextInt();

    for (int i = 0; i <= quantidadeAtivos; i++) {
        String codigoAtivo = scanner.nextLine();
        ativos.add(codigoAtivo);
    }

    ativos.sort(null);

    for (int i = 0; i < ativos.size(); i++){
        System.out.println(ativos.get(i));
    }
    scanner.close();
  }
}
