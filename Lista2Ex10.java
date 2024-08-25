import java.util.Scanner;

public class Lista2Ex10 {
    public static void main(String[] args) {

        int horaInicio, horaTermino, minutosInicio, minutosTermino, horasDuracao, minutosDuracao;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a hora e o minuto do início da partida:");
        horaInicio = scan.nextInt();
        minutosInicio = scan.nextInt();

        System.out.println("Insira a hora e o minuto do término da partida:");
        horaTermino = scan.nextInt();
        minutosTermino = scan.nextInt();

        if (horaTermino >= horaInicio) {
            horasDuracao = horaTermino - horaInicio;
            minutosDuracao = minutosTermino - minutosInicio;
        } else { 
            horasDuracao = 24 - horaInicio + horaTermino;
            minutosDuracao = minutosTermino - minutosInicio;
        }

        
        if (minutosDuracao < 0) {
            horasDuracao--;
            minutosDuracao += 60;
        }

        System.out.println("A duração do jogo foi de " + horasDuracao + " horas e " + minutosDuracao + " minutos.");

  
    }
}
