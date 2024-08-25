import java.util.Scanner;

public class Lista2Ex7 {
    public static void main(String[] args) {

        Double altura, peso, imc;

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserir seu peso");
        peso = scan.nextDouble();

        System.out.println("Inserir sua altura");
        altura = scan.nextDouble();

        imc = ( peso / (altura * altura));

        if (imc <=16) {
            System.out.println("Magreza Severa");
        }else if (imc <17) {
            System.out.println("Magreza Moderada");
        }else if (imc >=17 && imc <=18.5) {
            System.out.println("Magreza Leve");
        }else if (imc <25) {
            System.out.println("Normal");
        }else if (imc <30) {
            System.out.println("Obesidade Leve");
        }else if (imc <40) {
            System.out.println("Obesidade Severa");
        }else {
            System.out.println("Obesidade Mórbida");
        }

    }
}
