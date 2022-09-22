// EXERCICIO 40
import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0, b=0, c=0;

        System.out.println("Informe o valor do vertice a");
        a = input.nextInt();
        System.out.println("Informe o valor do vertice b");
        b = input.nextInt();
        System.out.println("Informe o valor do vertice c");
        c = input.nextInt();
        input.close();

        if((a+b<c)||(a+c<b)||(b+c<a)){
            System.out.println("Valores não formam um triângulo!");
        }else if((a==b)&&(b==c)){
            System.out.println("Equilátero");
        }else if((a!=b)&&(a==c)||(a==b)&&(a!=c)||(b!=a)&&(b==c)){
            System.out.println("Isósceles");
        }else if ((a!=b)&&(a!=c)&&(b!=c)){
            System.out.println("Escaleno");
        }

    }
}
