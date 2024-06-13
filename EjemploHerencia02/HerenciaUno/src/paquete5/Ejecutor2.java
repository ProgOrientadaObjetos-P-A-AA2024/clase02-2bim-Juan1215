/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {

        ArrayList<EstudiantePresencial> estudiantes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextDouble();

            EstudiantePresencial presencial = new EstudiantePresencial(nombre,
                    apellido, identificacion, edad, creditos, costo);
            presencial.calcularMatriculaPresencial();

            estudiantes.add(presencial);
            entrada.nextLine();

            System.out.println("Desea salir del programa (si)");
            String respuesta = entrada.nextLine();
            if (respuesta.equals("si")) {
                bandera = false;
            }
        }
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println(estudiantes.get(i));
        }
    }
}
