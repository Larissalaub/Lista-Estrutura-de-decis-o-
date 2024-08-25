import java.util.Scanner;

public class Lista2Ex1 {
    public static void main(String[] args)  {
        int n1, n2;

        Scanner scan = new Scanner(System.in);


        System.out.println("Por favor inserir 2 numeros");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        

        if (n1>n2) {
            System.out.println("o maior numero que você digitou");

            System.out.println(n1);
        }else if (n2>n1) {
            System.out.println("o maior numero que você digitou");
            System.out.println(n2);

        }else{
            
            System.out.println("Esses numero que voçê digitou são iguais");
            System.out.println(n1);
            System.out.println(n2);
        }


    }
}
