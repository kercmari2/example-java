import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 5;
        //Ejercicio 1
        double volumen = calcularVolumenEsfera(numero);
        System.out.println("El volumen de la esfera con radio " + numero + " es: " + volumen);
        // Ejericico 3
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
        // Ejercicio 4
        if (esPar(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
        //Ejericico 6
        saludarUsuario();

        //Ejercicio 7
        LocalDate fechaNacimiento = LocalDate.of(2024, 4, 1);
        LocalDate fechaActual = LocalDate.now(); // Fecha actual

        long diasVividos = calcularDiasVividos(fechaNacimiento, fechaActual);

        System.out.println("Has vivido aproximadamente " + diasVividos + " días.");
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
    public static long calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo.");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void saludarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre + "! Genial ser  Hackwomen.");

        scanner.close();
    }
    public static double calcularVolumenEsfera(double radio) {
        double pi = Math.PI; //
        double volumen = (4.0 / 3.0) * pi * Math.pow(radio, 3);
        return volumen;
    }
    public static long calcularDiasVividos(LocalDate fechaNacimiento, LocalDate fechaActual) {
        return ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);
    }
}
