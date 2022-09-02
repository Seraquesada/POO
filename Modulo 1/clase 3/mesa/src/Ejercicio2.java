
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Integer numero = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = scanner.nextInt();

// en vez de darme 5 primos, me da 5 veces la cant de primos que
// entre 0 y ese numero (ejemplo: 5 me
// devuelve 2,2,2,2,2,3,3,3,3,3
        for (int i = 0; i < numero ; i++) {
            Integer cantPrimos= 0;
            for ( int contador= 0 ; contador < numero ;contador++){
               if (numPrimos(i)) {
                   cantPrimos++;
            }
        }if (cantPrimos != 0){
                System.out.println(i);
            }
    }
}
    public static boolean numPrimos(int numero){
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero  ; i++) {
            if (numero % i == 0){
                return  false;}
        }
        return true;
    }


}
