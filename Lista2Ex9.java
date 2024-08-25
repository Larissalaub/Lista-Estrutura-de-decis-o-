import java.util.Scanner;

public interface Lista2Ex9 {
    public static void main(String[] args) {
        
        Double operacao2, operacao1, operacao, soma , raiz, valorraiz, base, expoente, resultadoPotencia, elevar;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma dessas operaçoes");

        System.out.println("1. Somar dois números");
        System.out.println("2. Raiz quadrada de um número");
        System.out.println("3. Elevar um número a uma potência ");
        operacao = scan.nextDouble();

        if (operacao == 1) {
            System.out.println("Iserir 2 numero");
            operacao1 = scan.nextDouble();
            operacao2 = scan.nextDouble();
            soma = operacao1 + operacao2;

            System.out.println("O resultado da soma é " + soma);
        }else if (operacao == 2) {
            System.out.println("Digite um numero ");
            raiz = scan.nextDouble();
            valorraiz = Math.sqrt(raiz);
            System.out.println("A raiz é " + valorraiz);
        }else if (operacao == 3) {
            System.out.println("Digite a base:");
            base = scan.nextDouble();
            System.out.println("Digite o expoente:");
            expoente = scan.nextDouble();
            resultadoPotencia = Math.pow(base, expoente);
            System.out.println(base + " elevado a " + expoente + " é igual a " + resultadoPotencia);
        }else{
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }



       
    }
}
