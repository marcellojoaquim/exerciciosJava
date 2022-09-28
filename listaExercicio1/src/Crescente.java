// EXERCICIO 5

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("Informe os números: ");
        for(int i=0; i < 4; i++){
            lista.add(sc.nextInt());
        }
        
        Collections.sort(lista);

        System.out.println(" ");
        System.out.println("Lista ordenada: ");
        for (Integer integer : lista) {
            System.out.print(integer+", ");
        }



        sc.close();
    }
}
