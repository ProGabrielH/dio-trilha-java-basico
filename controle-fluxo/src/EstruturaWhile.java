// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom;

public class EstruturaWhile {
    public static void main(String[] args) {

        int mesada = 50;
            while(mesada>0) {
                int valorDoce = valorAleatorio();
                if(valorDoce > mesada)
                    valorDoce = mesada;

                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada:" + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");
            
    }
    private static int valorAleatorio() {
        return ThreadLocalRandom.current().nextInt(2,15);
    }
}