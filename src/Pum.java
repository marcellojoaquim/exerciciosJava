//EXERCICIO 33
import java.util.Scanner;

public class Pum{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int linhas=0, q =1;
        linhas = input.nextInt();
        input.close();
        for(int i=0; i<linhas; i++ ){
            System.out.println();
            for(int j=1; j<=4;j++){
                
                if(q%4 != 0){
                    System.out.print(q+" "); 
                    
                } else if(q%4 ==0){
                    System.out.print("PUM");
                }
                q++;
            }

            
        }
    }

}