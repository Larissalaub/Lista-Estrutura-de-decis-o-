import java.util.Scanner;

public class Lista2Ex2 {
    public static void main(String[] args)  {
        int n1, n2, n3;

        Scanner scan = new Scanner(System.in);


        System.out.println("Por favor inserir 3 numeros");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();

        if (n1<n2 && n1<n3) {
            System.out.println("o menor numero que você digitou é");

            System.out.println(n1);
        }else if (n2<n1 && n2<n3) {
            System.out.println("o menor numero que você digitou é");
            System.out.println(n2);

        }else{
            System.out.println("o menor numero que você digitou é");
            System.out.println(n3);
           
        }


    }
}
