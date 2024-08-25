import java.util.Scanner;

public class Lista2Ex4 {
    public static void main(String[] args){

        double vl1, vl2, vl3;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inserir 3 valores");
        vl1 = scan.nextDouble();
        vl2 = scan.nextDouble();
        vl3 = scan.nextDouble();

        if (vl3>vl1 && vl3<vl2) {
            System.out.println("Esse valor está sim entre o valor 1 e 2");
        }else if (vl3>vl2 && vl3<vl1) {
            System.out.println("Esse valor está sim entre o valor 1 e 2");
        }
        else{
            System.out.println("Esse valor não está entre o valor 1 ou 2");

        }
    }
}
