import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Lista2Ex11 {
    public static void main(String[] args) {

        Double nota1, nota2, nota3, media, recuperacao, mediarecup;

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserir as 3 notas do aluno");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();

        media = (nota1 + nota3 + nota2)/ 3;

        if (media >=6) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");

            if (media == 5) {
                System.out.println("o aluno está de recuperação");
                System.out.println("Iserir a nota do aluno na recuperação");
                recuperacao = scan.nextDouble();
                mediarecup = (media + recuperacao)/ 2; 
                if (recuperacao >= 6) {
                    System.out.println("Aluno passou pela recuperação");
                }else{
                    System.out.println("Aluno reprovado na recuperação");
                }
            }
            
        }
    }
}
