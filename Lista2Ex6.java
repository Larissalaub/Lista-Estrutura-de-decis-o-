import java.util.Scanner;

public class Lista2Ex6 {
    public static void main(String[] args)  {
        
        Double salario, bonus, auxilio;

        Scanner scan = new Scanner(System.in);

        System.out.println("Iserir do funcionário salario R$2");
        salario = scan.nextDouble();
        

        if (salario <=2000) {
            bonus = salario *  1.10 + 350;
            System.out.println("Seu salario agora é" + bonus);
        }else if (salario <=3000) {
            bonus = salario * 1.08;
            System.out.println("Seu salario agora é" + bonus);
        }else{
            bonus = salario * 1.05;
            System.out.println("Seu salario agora é" + bonus);
        }
        if (salario <= 2500) {
            auxilio = bonus + 350;
        }else {
            auxilio = bonus + 300;
        }

    }
}
