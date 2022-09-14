//EXERCICIO 8
import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        
        double RH, RM, RC, IR=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Renda da Mulher: ");
        RM = input.nextDouble();
        System.out.println("Renda do Homem: ");
        RH = input.nextDouble();
        input.close();


        RC = (RH + RM);

        if(RC <= 900.00){
            IR = 0;
        }
        if((RC >= 900.01)&&(RC <= 1500.00)){
            IR = 0.1;
        }
        if((RC >= 1500.01)&&(RC <= 2500.00)){
            IR = 0.15;
        }
        if(RC > 2500.00){
            IR = 0.25;
        }

        System.out.println("Renda Conjunta: "+ RC);
        System.out.println("Alíquota Utilizada: "+(IR*100)+"%");
        System.out.println("Imposto de Renda: "+(RC*IR));
        System.out.println("Renda Liquida: "+(RC - (RC*IR)));
    }
}
