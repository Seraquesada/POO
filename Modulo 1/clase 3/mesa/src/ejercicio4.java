import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

        //Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más
        //horas las mismas se consideran horas extras cuyo valor es un 50% más que las horas de
        //trabajo normales. Crear un programa que pueda informar si el sueldo semanal de la
        //programadora Julieta. Ella trabajó en la última semana “x” cantidad de horas y el valor de la
        //hora semanal es de 875.

public class ejercicio4 {
    public static void main(String[] args) {

    Scanner scanner= new Scanner(System.in);
    System.out.println("Ingrese horas trabajadas: ");
    Integer horasTrabajadas = scanner.nextInt();

    System.out.println("Hizo horas extras: ");
    Integer horasExtras = scanner.nextInt();
    pagarJulieta(horasTrabajadas, horasExtras);
    }
    public static void pagarJulieta(Integer horasTrabajadas, Integer horasExtras){
        Integer horasMax = 40;
        Integer valorHoraTrabajo = 875;
        Integer valorHoraExtra = (valorHoraTrabajo/2) + valorHoraTrabajo ;
        if (horasTrabajadas <= horasMax && horasExtras == 0 && horasExtras == null ){
            System.out.println("El sueldo de esta semana de Julieta es de " +  horasTrabajadas * valorHoraTrabajo);
        } else if (horasExtras >= 0 && horasTrabajadas <= horasMax) {
            System.out.println("El sueldo de esta semana de Julieta es de " + (valorHoraExtra * horasExtras + valorHoraTrabajo * horasTrabajadas));
        } else {
            System.out.println("Los datos fueron ingresados de manera erroneo o no se ingreso ningundato");
        }

    }
}