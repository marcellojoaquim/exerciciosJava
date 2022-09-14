//EXERCICIO 24
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o numero: ");
        int numero = input.nextInt();
        int aux = numero;
        input.close();
        int invertido = 0;


        while(numero > 0){
            invertido *= 10;
            invertido += (numero%10);
            numero /= 10;
        }
        if(aux == invertido){
            System.out.println("S");
        }else{System.out.println("N");}
        
    }
}
