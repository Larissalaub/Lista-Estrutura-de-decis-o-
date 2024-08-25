import java.util.Scanner;

public class Lista2Ex12 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, presenca, mediaNotas, aulasDadas, premio, percentualPresenca;

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira as 4 notas do aluno (entre 0 e 100):");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();
        nota4 = scan.nextDouble();

        System.out.println("Insira a quantidade de aulas dadas:");
        aulasDadas = scan.nextDouble();

        System.out.println("Insira a quantidade de presenças do aluno:");
        presenca = scan.nextDouble();

        mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
         percentualPresenca = (presenca / aulasDadas) * 100;

        if (mediaNotas > 80 && percentualPresenca == 100) {
            System.out.println("O aluno ganhou uma Excursão.");
        } else if (mediaNotas > 80 || percentualPresenca == 100) {
            System.out.println("O aluno ganhou uma Camiseta.");
        } else if (mediaNotas >= 70 && mediaNotas <= 80 && percentualPresenca >= 90) {
            System.out.println("O aluno ganhou um Squeeze.");
        } else if (mediaNotas >= 70 && mediaNotas <= 80 || percentualPresenca >= 90) {
            System.out.println("O aluno ganhou uma Caneta personalizada.");
        } else {
            System.out.println("O aluno não se qualificou para nenhum prêmio.");
        }

      
    }
}
