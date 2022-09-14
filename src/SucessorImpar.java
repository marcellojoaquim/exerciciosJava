//EXERCICIO 14
import java.util.Scanner;

public class SucessorImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, valida =0;
        x=input.nextInt();
        input.close();

        while(valida <= 11){
            if (x%2 != 0){
                System.out.println(x);
            }
            x++;
            valida++;
        }

    }
}
