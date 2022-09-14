//EXERCICIO 10

import java.util.Scanner;

public class ConverteDiasAnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano=0, mes=0, dia=0;
        System.out.println("Informe um valor inteiro correspondente a dias: ");
        int dias = sc.nextInt();
        sc.close();

        while(dias >= 365){ ano ++; dias-=365;}
        while(dias >=30){ mes++; dias-=30; }
        while(dias >= 1){ dia++; dias -=1; }

        System.out.println(" ");
        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mês(s)");
        System.out.println(dia+" dia(s)");
    }
}