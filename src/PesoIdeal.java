// EXERCICIO 41
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double peso, altura;

        System.out.println("Informe o ALTURA e PESO:");
        altura = input.nextDouble();
        peso = input.nextDouble();
        
        input.close();

        if(altura<=1.50){
            if(peso==50){
                System.out.println("Parabéns peso ideal");
            }else if(peso<50){
                System.out.println("Engorde "+(50-peso));
            }else if(peso>50){
                System.out.println("Emagreça "+(peso-50));
            }
        }else if((altura > 1.5)&&(altura <=1.9)){
            if(peso==70){
                System.out.println("Parabéns peso ideal");
            }else if(peso<70){
                System.out.println("Engorde "+(70-peso));
            }else if( peso>70){
                System.out.println("Emagreça "+(peso-70));
            }
        }else if(altura>=1.91){
            if(peso==100){
                System.out.println("Parabéns peso ideal");
            }else if(peso<100){
                System.out.println("Engorde "+(100-peso));
            }else if(peso>100){
                System.out.println("Emagreça "+(peso-100));
            }
        }

    }
}
