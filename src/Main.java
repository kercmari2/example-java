import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 5;
        //Ejercicio 1 Volumen de Esfera
        double volumen = calcularVolumenEsfera(numero);
        System.out.println("El volumen de la esfera con radio " + numero + " es: " + volumen);
        //Ejercicio 2 Ordenar de menor a mayor
        int[] arr = {9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // Ejericico 3 calcular el factorial de un nu,ero
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
        // Ejercicio 4 Numero par o impar
        if (esPar(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
        //Ejercicio 5
        Calendar cal= Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        LocalDate diaMuertos = LocalDate.of(year,11,2);
        LocalDate diaNavidad = LocalDate.of(year,12,24);
        LocalDate fechaActual = LocalDate.now(); // Fecha actual

        long diasRestanteMuertos = calcularDiasRestantes(diaMuertos, fechaActual);
        long diasRestanteNavidad = calcularDiasRestantes(diaNavidad, fechaActual);

        System.out.println("Falta para dia de muertos aproximadamente  " + diasRestanteMuertos + " días.");
        System.out.println("Falta para dia de navidad aproximadamente  " + diasRestanteNavidad + " días.");
        //Ejericico 6
        saludarUsuario();

        //Ejercicio 7
        LocalDate fechaNacimiento = LocalDate.of(2024, 4, 1);


        long diasVividos = calcularDiasRestantes(fechaNacimiento, fechaActual);

        System.out.println("Has vivido aproximadamente " + diasVividos + " días.");
        //Ejerciio 8
        int base = 13;
        int alura = 5;
        double areaTriangle = areaTriangle(base, alura);
        System.out.println("El area del triangulo " + String.valueOf(areaTriangle) + " .");
        //Ejercicio 9
        int salarioActual = 12000;
        double valorIncremento = incrementoSalarioal(salarioActual);
        System.out.println("El sueldo con incremento es " + String.valueOf(valorIncremento) + " .");

        //Ejercicio 10
        int distancia = 13;
        int velocidad = 5;
        long tiempo = calcularTiempo(distancia, velocidad);
        System.out.println("El tiempo de la distancia recorrida " + String.valueOf(tiempo) + " .");
        //Ejercicio 11
        String s3 = "Madam";
        String s4 = "Now, sir, a war is won!";

        boolean b3 = validPalindrome(s3);
        boolean b4 = validPalindrome(s4);
      
        System.out.println("is " + s3 + " a palindrome? " + b3);
        System.out.println("is " + s4 + " a palindrome? " + b4);
        //Ejercicio 12

        int year_b = 2024;
        String message = bisieto(year_b)? "es":"no es";
        System.out.println("El año "+String.valueOf(year_b)+ message + " bisiesto" );
    }
    public static boolean validPalindrome(String palindrome) {
        StringBuffer buffer = new StringBuffer(palindrome);
        buffer.reverse();
        String data = buffer.toString();
    if (palindrome.equals(data)){
        return true;
    }

        return false;
    }
    public static boolean bisieto(int year) {
        if (Year.isLeap(year)) {
           return true;
        } else {
           return false;
        }
    }
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
    public static double areaTriangle(int base, int height) {
        return (base*height/2);
    }
    public static double incrementoSalarioal(int salario) {
        double salarioFinal = salario;
        if (salario < 15000) {
            salarioFinal*=1.20;
        }else{
            salarioFinal *=1.15;
        }
        return salarioFinal;
    }
    public static long calcularTiempo(int distancia, int velocidad) {
        if (velocidad < 0) {
            throw new IllegalArgumentException("No se puede tiempo  de un número negativo.");
        }
        return distancia/velocidad;
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
    public static long calcularDiasRestantes(LocalDate fechaNacimiento, LocalDate fechaActual) {
        return ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);
    }
}
