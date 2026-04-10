package Java6Loops;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {

        System.out.println("Bienvenido al generador de número ganador");

        Scanner scanner = new Scanner(System.in);

        externo:do {

            System.out.println("Ingrese el número total de participantes:");

            int totalParticipantes = 0;

            do {
                if (!scanner.hasNextInt()) {
                    System.out.println("No puedes ingresar letras, por favor ingresa un número válido de participantes (mayor que 0):");
                    scanner.next(); // Limpiar el buffer de entrada
                    continue;
                }

                totalParticipantes = scanner.nextInt();

                if (totalParticipantes <= 0) {
                    System.out.println("Por favor, ingrese un número válido de participantes (mayor que 0):");
                }
            } while (totalParticipantes <= 0 );

            int numeroGanador = (int) (Math.random() * totalParticipantes) + 1;

            System.out.println("El número ganador es: " + numeroGanador);

            String respuesta;

            do {
                System.out.println("¿Desea generar otro número ganador? (s/n)");

                respuesta = scanner.next();

                switch (respuesta.toLowerCase()) {
                    case "s":
                        break;
                    case "n":
                        break externo;
                    default:
                        System.out.println("Solo funciona con las letras s para sí y n para no. Por favor, ingrese una respuesta válida.");
                        break;
                }
            } while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));

        } while (true);

        scanner.close();
    }
}