import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);

        System.out.println("Bem vindo ao jogo de adivinhação!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivinhe um número de 1-100");

        int numeroUsuario;
        int i = 0;

        while (i < 5){
            numeroUsuario = scanner.nextInt();
            i++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou.");
                break;
            } else {
                System.out.printf("Você errou, tente novamente. %d tentativas restantes%n", 5 - i);
            }
        }

        if (i == 5) {
            System.out.println("Suas tentativas acabaram. O número correto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}