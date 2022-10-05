// EXERCICIO 48
import java.util.Scanner;

public class Dosagem {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade=0;
        float peso=0;

        System.out.println("Informe a idade e o peso");
        idade = input.nextInt();
        peso = input.nextFloat();
        input.close();

        if(idade<12){
            if((peso>=5)&&(peso<=9)){
                System.out.println("5 gotas");
            }else if((peso>9)&&(peso<=16)){
                System.out.println("10 gotas");
            } else if((peso>16)&&(peso<=24)){
                System.out.println("15 gotas");
            } else if((peso>24)&&(peso <=30)){
                System.out.println("20 gotas");
            }else if(peso > 30){
                System.out.println("30 gotas");
            }
        }else{
            if(peso>=60){
                    System.out.println("40 gotas");
                }if(peso<60){
                    System.out.println("35 gotas");
            }
        }
    }
}
