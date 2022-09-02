import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //scanner
        //creo una variable de tipo Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa tu nombre");

        String nombre = scanner.nextLine();

        System.out.println("ingresa tu edad");

        Integer edad = scanner.nextInt();

        System.out.println("nombre: " + nombre + " edad: " + edad);

        //Bucles
        contarHasta(edad);

        //Funciones
        if (esDivisible(edad, 2)) {
            System.out.println("tu edad es par");
        } else {
            System.out.println("tu edad no es par");
        }

    }

    // funciones
//    function esDivisible(a,b){
//
//    }

    public static Boolean esDivisible (Integer numeroA, Integer numeroB){


        return numeroA % numeroB == 0;
    }

    public static void contarHasta(Integer numero){
        for (int i = 0; i < numero; i++) {
            System.out.println(i);
        }
    }

    public static Boolean sonTextosIguales(String textoA,String textoB){
        return textoA.equals(textoB);
    }


}