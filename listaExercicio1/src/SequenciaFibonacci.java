//EXERCICIO 15
import java.util.Scanner;

public class SequenciaFibonacci {

    static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iforme um numero entre 0 e 46");
        int num = input.nextInt();
        input.close();
	for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

}
