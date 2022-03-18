import java.util.Scanner;

public class Appa {
    public static void main(String[] args) {
        
        Fibonacci a = new Fibonacci(15);
        System.out.println(a.getResult());

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int numero = scan.nextInt();
        int suma = 0;
        scan.close();
        Scan s = new Scan();
        System.out.println(s.mostrarSerie(numero));

    }
}
