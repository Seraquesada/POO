import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        Integer numero = scanner.nextInt();
        esPrimo(numero);
        //maximoEntreTresNumeros(3,6,12);
    }
    public static boolean esPrimo(Integer numero) {

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("Numero es primo");
                return true;
            } else {
                System.out.println("Numero no es primo");
                return false; }
        }
        return false;
    }}

 /*   public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){

        if (unNumeroA > unNumeroB && unNumeroA> unNumeroC ) {
            System.out.println("El numero mas alto es " + unNumeroA);
        } else if (unNumeroB > unNumeroA && unNumeroB > unNumeroC) {
            System.out.println("EL numero mas alto es " + unNumeroB);
        } else {
            System.out.println("El numero mas alto es " + unNumeroC);
        }

    }

    }


 public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {
     int comparar;
     int comparar2;
     if ( comparar == unNumeroA.compareTo(unNumeroB) ){
         if(comparar>0) {
             if(comparar = unNumeroA.compareTo(unNumeroC){
                 if (comparar > 0) {
                     System.out.println("El mayor es " + unNumeroA);
                 }
             }
         }
     }else if(comparar2 == unNumeroB.compareTo(unNumeroA) ){
         if(comparar2>0) {
             if(comparar2 = unNumeroB.compareTo(unNumeroC) {
                 if (comparar2 > 0) {
                     System.out.println("El mayor es " + unNumeroB);
                 }
             }
         }
     }
 } else{
        System.out.println("El mayor es " + unNumeroC);}
}
  */
