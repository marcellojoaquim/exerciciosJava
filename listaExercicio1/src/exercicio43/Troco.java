//EXERCICIO 43

import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0, m=0, troco=0, contaCedula=0;

        System.out.println("Valor da compra: ");
        n = input.nextInt();
        System.out.println("Valor pago: ");
        m=input.nextInt();

        input.close();

        if(n>m){
            System.out.println("Não é possível pagar com um valor menor...");
        }else{
            troco = (m-n);
        }
        
        while(troco >= 100){ contaCedula ++; troco -= 100; }
        while(troco >= 50){ contaCedula ++;  troco-= 50; }
        while(troco >= 20){ contaCedula ++; troco -= 20; }
        while(troco >=10){ contaCedula ++; troco -= 10; }
        while(troco >= 5){ contaCedula ++; troco -= 5; }
        while(troco >= 2){ contaCedula ++; troco -= 2; }

        if((contaCedula>2)){
            System.out.println("Impossível");
        }else{
            System.out.println("Possível");
        }

    }
}
