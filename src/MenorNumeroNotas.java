// EXERCICIO 7
import java.util.Scanner;

public class MenorNumeroNotas {
    public static void main(String[] args) {

        int valor, cedula100 =0, cedula50=0, cedula20=0, cedula10=0, cedula5=0, cedula2=0, moeda1=0;

        System.out.println("Informe o valor: ");
        Scanner input = new Scanner(System.in);
        valor = input.nextInt();

        System.out.println("Valor: "+valor);
        System.out.println(" ");
        if (valor > 0){

        }else{
            System.out.println("Informe um valor inteiro maior de zero");
        }
        
        while(valor >= 100){ cedula100 ++; valor -= 100; }
        while(valor >= 50){ cedula50 ++;  valor-= 50; }
        while(valor >= 20){ cedula20 ++; valor -= 20; }
        while(valor >=10){ cedula10 ++; valor -= 10; }
        while(valor >= 5){ cedula5 ++; valor -= 5; }
        while(valor >= 2){ cedula2++; valor -= 2; }
        while(valor >=1){ moeda1 ++; valor -= 1; }

        
        System.out.println(cedula100+" notas de R$ 100,00");
        System.out.println(cedula50+" notas de R$ 50,00");
        System.out.println(cedula20+" notas de R$ 20,00");
        System.out.println(cedula10+" notas de R$ 10,00");
        System.out.println(cedula5+" notas de R$ 5,00");
        System.out.println(cedula2+" notas de R$ 2,00");
        System.out.println(moeda1+" moedas de R$ 1,00");

        input.close();
    }
}
