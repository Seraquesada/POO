import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sumar(5,5);
        restar(5,5);
        division(5,5);
        multiplicacion(5,5);
    }
    public static Integer sumar(int a, int b) {

       return  a + b;

    }

    public static Integer restar(int a, int b){
        return  a - b;
    }

    public static Integer division (int a, int b){
        return a/b;
    }

    public static Integer multiplicacion(int a, int b) {
        return a * b;
    }


}
