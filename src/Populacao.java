//EXERCICIO 16
import java.util.Scanner;

public class Populacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a=0, b=0;
        System.out.println("Informe a população de A");
        a=input.nextDouble();
        System.out.println("Informe a populacão de B");
        b=input.nextDouble();
        input.close();
        int tempo =1;

        while(a < b){
            a += (0.03*a);
            b += (0.015*b);
            tempo++;
        }
       
        System.out.println(tempo+" anos");
    }
}
