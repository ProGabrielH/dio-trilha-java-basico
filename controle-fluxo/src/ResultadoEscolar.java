public class ResultadoEscolar {

    public static void main(String[] args) {
        
        // Condicional composta

        int nota = 6;
       
        if(nota >= 7)
         System.out.println("Aprovado");
 
        else
         System.out.println("Reprovado");

         // Condicional encadeada

         int nota2 = 6;

         if (nota2 >= 7)
             System.out.println("Aprovado");
         else if (nota2 >= 5 && nota2 < 7)
             System.out.println("Recuperação");
         else
             System.out.println("Reprovado");

        // Condicional ternária

        int nota3 = 6;
		String resultado = nota3 >=7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);

    }
    
}
