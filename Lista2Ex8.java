import java.util.Scanner;

public class Lista2Ex8 {
    public static void main(String[] args) {

        Double x, y, z, etriangulo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserir o valor de x");
        x = scan.nextDouble();
        System.out.println("Inserir o valor de y");
        y = scan.nextDouble();
        System.out.println("Inserir o valor de z!");
        z = scan.nextDouble();

        

        if ( (x + y> z) && (x + z > y) && (y+ z > x)) {
            if (x == y & y == z) {
                System.out.println("O triangulo é um Equilatero");
            }else if (x == y || x == z || y == z ) {
                System.out.println("O triangulo é um Isóceles");
            }else{
                System.out.println("O triangulo é escaleno");
            }
        }else{
            System.out.println("Os valores inseridos nao pode ser um triangulo");
        }


    }
}
