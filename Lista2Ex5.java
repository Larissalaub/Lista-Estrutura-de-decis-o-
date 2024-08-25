import java.util.Scanner;

public class Lista2Ex5 {
    public static void main(String[] args) {

        double altura, peso, Mulher, homem;

        String sexo;

         Scanner scan = new Scanner(System.in);


        System.out.println("Iserir o sexo F ou M");
        sexo = scan.nextLine();

        System.out.println("Iserir o peso");
        peso = scan.nextDouble();

        System.out.println("Iserir Altura");
        altura = scan.nextDouble();

        if (sexo == "F") {
            Mulher = 52 + (0.62*(altura-152.4));

            System.out.println(Mulher);

        }else{
            homem = 52+(0.75*(altura-152.4));
            System.out.println(homem);

        }



    }
}
