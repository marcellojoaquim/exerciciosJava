// EXERCICIO 35

public class UriSequencia {
    public static void main(String[] args) {
        double a, b=1, c, s=0;
        for(a=1; a<=39; a+=2){
            c=a/b;
            s+=c;
            b*=2;
        }
        System.out.println(s);
    }
}
