// EXERCICIO 1

import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, media;

        System.out.println("Informe a nota A do aluno: ");
        A = sc.nextDouble();

        System.out.println("Informe a nota B do aluno: ");
        B = sc.nextDouble();

        media = ((A*3.5)+(B*7.5))/11;

        if(media > 10){
            media = 10;
        }
        
        System.out.format("Média " +"%.4f",media);
        sc.close();
    }
}