// EXERCICIO 49
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        float peso=0, altura=0, imc=0;
        System.out.println("informe os valores de peso e altura");
        peso = input.nextFloat();
        altura = input.nextFloat();
        input.close();
        imc = (peso/(altura*altura));

        if(imc<20){
            System.out.println("IMC = "+imc+" - Abaixo do peso");
        }else if((imc>=20)&&(imc<=25)){
            System.out.println("IMC = "+imc+" - Peso Normal");
        }else if((imc>25)&&(imc<=30)){
            System.out.println("IMC = "+imc+" - Sobrepeso");
        }else if((imc>30)&&(imc<=40)){
            System.out.println("IMC = "+imc+" - Obeso");
        }else if(imc>40){
            System.out.println("IMC = "+imc+" - Obeso Mórbido");
        }
        
    }
}
