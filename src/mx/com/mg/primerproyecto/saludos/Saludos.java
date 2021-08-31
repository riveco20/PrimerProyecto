package mx.com.mg.primerproyecto.saludos;

import java.util.Scanner;

public class Saludos {
    public String nombre;
    public String numeroCelular;
    public String edad;
    public Scanner consola = new Scanner(System.in);

    public Saludos(){

    }

    public void imprimirinformacion(){
        System.out.println("Ingrese su nombre");
        this.nombre = consola.nextLine();
        System.out.printf("Ingrese su numero de celular: ");
        this.numeroCelular =(consola.nextLine());
        System.out.println("Ingresa tu edad");
        this.edad =(consola.nextLine());

        System.out.println("Bienvenido señor "+ (nombre) + ", es un placer para nosotros contar con una persona de " + (edad) +" años.\n" +
                "\n" +
                "Próximamente nos comunicaremos con usted al numero "+ (numeroCelular)+ ".\n" +
                "\n" +
                "Feliz día");

    }

}
