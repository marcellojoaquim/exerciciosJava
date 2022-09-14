//EXERCICIO 22
import java.util.Scanner;

public class ConsumoAgua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int consumo; 
        double totalPagar =7;
        System.out.println("Informe o valor do consumo: ");
        consumo = input.nextInt();
        input.close();

        if(consumo<=10){     
            totalPagar+=0;
        }else if(consumo >100){
            consumo-=10;
            while(consumo >0){ totalPagar += 5; consumo--;}
        }else if((consumo >31)&&(consumo<=100)){
            consumo -= 10;
            while((consumo >0)){ totalPagar += 2; consumo--;}
        }else if((consumo >11)&&(consumo<=30)){
            consumo -= 10;
            while((consumo >0)){ totalPagar++; consumo --;}
        }
        
        
        

        System.out.printf("Valor em Reais: "+"%.2f",totalPagar);
    }
    
}