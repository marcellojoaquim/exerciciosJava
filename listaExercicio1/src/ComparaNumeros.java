//EXERCICIO 23
import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Informe os valores de x e y consecutivamente:");
        x=input.nextInt();
        y=input.nextInt();
        input.close();

        if(x>y){System.out.println(1);}else{System.out.println(0);}
        if(x==y){System.out.println(1);}else{System.out.println(0);}
        if(x<y){System.out.println(1);}else{System.out.println(0);}
        if(x!=y){System.out.println(1);}else{System.out.println(0);}
        if(x>=y){System.out.println(1);}else{System.out.println(0);}
        if(x<=y){System.out.println(1);}else{System.out.println(0);}
    }
}
