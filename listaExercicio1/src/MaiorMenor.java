// EXERCICIO 4
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        int num1, num2, num3, maior =0, menor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Informe o secundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Informe o terceiro numero: ");
        num3 = sc.nextInt();
        menor = num1;
      
       
        if((num1 > num2)&&(num1>num3)){
            maior = num1;
        }
        if((num2 > num3)&&(num2>maior)){
            maior = num2;
        }   
        if((num3 > num1)&&(num3>num2)){
            maior = num3;
        }else{
            maior = num1;
        }


        if((num2 < menor)&&(num2 < num3)){
            menor = num2;
        }else if(menor > num3){
            menor = num3;
        }else{
            menor = num1;
        }
        if(maior == menor){
            System.out.println("são iguais.");
        }
        System.out.println("Maior "+maior);
        System.out.println("Menor "+menor);

        sc.close();

    }
}
