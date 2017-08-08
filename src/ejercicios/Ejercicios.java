package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String nombre = null;
        int horasT = 0;
        double valorU = 0;
        double totalSalario = 0;
   
        System.out.println("Por favor, ingrese su nombre");
        nombre = datos.nextLine();
        System.out.println("Por favor, ingrese el número de horas de trabajo en la semana");
        horasT = datos.nextInt();
        System.out.println("Por favor, ingrese el valor de cada hora");
        valorU = datos.nextDouble();
        totalSalario = calcularSalario(horasT, valorU);
        System.out.println(nombre + " debe recibir " + totalSalario + " pesos, por sus " + horasT + " horas trabajadas en una semana");
    }

    public static double calcularSalario(int horasT, double valorU) {
        double totalSalario = 0;

        if (horasT <= 40) {
            totalSalario = horasT * valorU;
        } else if (40 < horasT && horasT < 48) {
            totalSalario = 40 * valorU + ((horasT - 40) * (valorU * 2));
        } else {
            totalSalario = 40 * valorU + 8 * (valorU * 2) + ((horasT - 48) * (valorU * 3));
        }

        return totalSalario;
        //System.out.println(nombre + " debe recibir " + totalSalario + " pesos, por sus " + horasT + " trabajadas en una semana");
    }

}
