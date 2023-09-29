public class TiposVariaveis {
    public static void main(String[] args){
        double salarioMinimo = 2500.50; // mesmo que o float no Python (existe float em java, mas é mais convencional usar o double )
        int idade = 22; // atribuição de valor inteiro
        final String NOME = "Gabriel Henrique"; // "final" torna a variável em constate, sendo assim imutável
        char sexo = 'M'; // char é usado para representar um único caractere 
        boolean empregado = false; // valor booleano represantado por true ou false
        System.out.println("Nome: "+ NOME);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: "+ idade);
        System.out.println("Está trabalhando: " + empregado);
        System.out.println("Salário: " + salarioMinimo);

    }
}
