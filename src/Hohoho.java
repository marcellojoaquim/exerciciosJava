//EXERCICIO 36
import java.util.Scanner;

public class Hohoho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdHo=0;
        qtdHo = input.nextInt();
        input.close();

        for(int i=0; i<qtdHo; i++){
            System.out.print("HO! ");
        }
    }    
}
