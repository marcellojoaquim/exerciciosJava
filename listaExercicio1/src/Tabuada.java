// EXERCICIO 39

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0;
        num = input.nextInt();
        input.close();
        for(int i=1; i<11; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
