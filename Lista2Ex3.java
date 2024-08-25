import java.util.Scanner;

public class Lista2Ex3 {
    public static void main(String[] args) {

        Double nt1, nt2, nt3, nt4, media;
        String nome;

        Scanner scan = new Scanner(System.in);



        System.out.println("Qual é o nome do aluno");
        nome = scan.nextLine();

        System.out.println("Inserir as 4 notas do aluno" + nome);
        nt1 = scan.nextDouble();
        nt2 = scan.nextDouble();
        nt3 = scan.nextDouble();
        nt4 = scan.nextDouble();

        media = (nt1 + nt2 + nt3 + nt4)/4;

        if (media< 20) {
            System.out.println("Classificação do aluno Pessima");
        }else if (media<=40) {
            System.out.println("Classificação do aluno Ruim");
        }else if (media<=60) {
            System.out.println("Classificação do aluno Regular");
        }else if (media<=80) {
            System.out.println("Classificação do aluno Bom");
        }else{
            System.out.println("Classificação do aluno ótimo");
        }
      

    }
}
