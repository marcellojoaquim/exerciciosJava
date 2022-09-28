
import java.util.Scanner;

// EXERCICIO 18
public class InverteNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o numero: ");
        int numero = input.nextInt();
        input.close();
        int invertido = 0;


        while(numero > 0){
            invertido *= 10;
            invertido += (numero%10);
            numero /= 10;
        }
        System.out.println(invertido);


    }
}
