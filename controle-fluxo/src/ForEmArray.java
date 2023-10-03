public class ForEmArray {
    public static void main(String[] args) {
        
        String alunos[] = {"GABRIEL", "DIMAS", "JESSICA", "KEVIN", "JEFESON"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("Aluno "+ x +": "+ alunos[x]);
        }

        for (String aluno : alunos){
            System.out.println("O nome do aluno é: "+ aluno );
        }
    }
    
}
